package com.morgado;
//mias
import com.morgado.Post;

import java.io.FileWriter;
//java
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.lang.reflect.Type;
import java.net.SocketImpl;

//terceros
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

//para hacer peticiones HTTP (get, post ...)  a una servidor web
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;



public class App 
{
    public static ArrayList<Post> LPost = new ArrayList<>();
    public static ArrayList<User> LUser = new ArrayList<>();

    public static Type postListType = new TypeToken<List<Post>>() {}.getType();
    public static Type userListType = new TypeToken<List<User>>() {}.getType();
    

    //prepara una instancia para realizar lecturas de consola
    public static  Scanner entrada = new Scanner(System.in); 
    //prepara la una conexión inicial HTTP (a un servidor web Apache/nginx/Tomcat/iis/Express)
    public static OkHttpClient client = new OkHttpClient(); 
    //url base de la API
    public static String urlRoot = "https://jsonplaceholder.typicode.com/"; 
    //ruta del fichero pòst.json
    public static String ruta = "/Users/morgado/Personal/Modulos/ProgDAW/JAVA/24-25/Proyectos/gestpost/public";


    public static void main( String[] args )
    {
        App.loadData();
        App.Menu();
    }

    public static void loadData(){
        App.CargarPost();
        App.CargarUser();
        //a cada usuario --> lista de Posts
        // a cada post --> su Usuario creador 
        App.Asignar();
    }
    public static void CargarUser(){
        //Crea la REQUEST Http de tipo Get para listar todos los Posts
        Request request = new Request.Builder()
                                .url(App.urlRoot + "users")
                                .build();
        System.out.println("Enviando ..."+ App.urlRoot + "users");
        try (Response response = client.newCall(request).execute() ) {
            if (!response.isSuccessful()){
                System.out.println("Response Users Fallido");
                throw new IOException("Unexpected code "+ response);
            }
            System.out.println("Conexión Establedida y Response ok");
            String responseBody = response.body().string();
            Gson gson = new Gson();
            App.userListType = new TypeToken<List<User>>() {}.getType();
            App.LUser = gson.fromJson(responseBody, userListType);
            // for (User user : App.LUser) {
            //     System.out.println(user.getName());
            // }  
        }catch (IOException e){ //IOException captura errores HTTP
            e.printStackTrace(); //mensaje generico tipo "Ayuda SysAdmin"
        }
    }
    public static void CargarPost(){
        //Crea la REQUEST Http de tipo Get para listar todos los Posts
        Request request = new Request.Builder()
                                .url(App.urlRoot + "posts")
                                .build();
        //Ejecutar la solicitud --> send
        System.out.println("Enviando ..."+ App.urlRoot + "posts");
        //client.newCall(request).execute(): Lanza la peticion (request) hacia la api
        //Api  :  (servidor web + sgbd) --> servidor fisico con su ip (dns)
        //La Api recibe una REQUEST (petición) y devuelve una RESPONSE (respuesta JSON)
        //me 
        try (Response response = client.newCall(request).execute() ) {
            if (!response.isSuccessful()){
                System.out.println("Response Posts Fallido");
                throw new IOException("Unexpected code "+ response);
            }
            System.out.println("Conexión Establedida y Response ok");
            String responseBody = response.body().string();
            Gson gson = new Gson();
            //genera la estructura del Post.json en base a la estructura de la clase Post
            App.postListType = new TypeToken<List<Post>>() {}.getType();
            //fromJson: transforma la respesta en formato json con su tipo (estructura)
            //y genera un arraylist de java (lista de obejtos)
            App.LPost = gson.fromJson(responseBody, postListType);
            // for (Post post : LPost) {
            //     System.out.println(post.getTitle());
            // }  
        }catch (IOException e){ //IOException captura errores HTTP
            e.printStackTrace(); //mensaje generico tipo "Ayuda SysAdmin"
        }
    }
    
    public static void guardarPost(){

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try (FileWriter writer = new FileWriter(App.ruta+"/posts.json")) {
            gson.toJson(App.LPost, writer);
            System.out.println("Archivo posts.json creado correctamente.");
        } catch (IOException e) {//IOException captura errores FILE
            e.printStackTrace(); //mensaje generico tipo "Ayuda SysAdmin"
        }
    }
    public static void guardarUsers(){

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try (FileWriter writer = new FileWriter(App.ruta+"/users.json")) {
            gson.toJson(App.LUser, writer);
            System.out.println("Archivo users.json creado correctamente.");
        } catch (IOException e) {//IOException captura errores FILE
            e.printStackTrace(); //mensaje generico tipo "Ayuda SysAdmin"
        }
    }

    public static ArrayList<Post> getPostUser(int id_user){
        //devolver el array de Post del usuario con id_user
        ArrayList<Post> lista = new ArrayList<>();
        User uactual = App.getUser(id_user);
        for (Post post: App.LPost ){
            //where user.id == Post.userid
            if ((post.getUserId()==id_user)){ 
                lista.add(post); //1 a M
                post.setUser(uactual); //1 a 1
            }
        }
        return lista;
    }

    public static User getUser(String nombre){

        /* select * Sistemas RELACIONALES (registro)
           from User as u --> alias
           where u.username == nombre
        */
        for (User u: App.LUser){
            if (u.getUsername().equals(nombre)){
                return u;
            }
        }
        return null;
    }
    public static User getUser(int id){
        for (User u: App.LUser){
            if (u.getId()==id){
                return u;
            }
        }
        return null;
    }

    public static void MostrarPostUser(String uname){
        //muestre el nombre del usuario y el titulo de sus posts
        User u = App.getUser(uname);
        System.out.println("Usuario "+ u.getId() + " : "+ u.getUsername() );
        for (Post post: u.posts){
            System.out.println(" - "+ "( "+ post.getUserId()+ " )"+  post.getTitle());
        }

    }
    public static void Asignar(){
        //Asignar los post a cada usuario
        for (User user: App.LUser){
            //1 a M
            user.posts = App.getPostUser(user.getId());
        }
    }

    public static void filtrar(String titulo){
        boolean contenido = false;
        for (User user: App.LUser){
            if (!user.posts.isEmpty()){
                System.out.println("* " + user.getName());
            }
            for (Post post: user.posts){
                contenido = post.getTitle().toLowerCase().contains(titulo) || post.getBody().toLowerCase().contains(titulo);
                if (contenido){
                    System.out.println("   - " + post.getId()+ " / " + post.getTitle() );
                }
            }
        }
    }
    public static void filtrar1(String titulo){
        boolean contenido = false;
        for (Post post: App.LPost){
            contenido = post.getTitle().toLowerCase().contains(titulo) || post.getBody().toLowerCase().contains(titulo);
            if (contenido){
                System.out.println("- " 
                    + "( "+ post.getId()+ " / " + post.getUser().getName() + " )" );
                System.out.println("   * "  + post.getTitle());
            }
        }
    }
    public static void Menu(){
        int opcion = -1;

        while (opcion != 0) {
            System.out.println("\n--- Menú de Empleados ---");
            System.out.println("1. Posts del usuario: ");
            System.out.println("2. User/Post que hablen de IA/CBS: ");
            System.out.println("6. Guardar Datos");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = App.entrada.nextInt();
            App.entrada.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1: 
                    System.out.print("Nombre del Usuario para ver sus posts: ");
                    String name = App.entrada.nextLine();
                    App.MostrarPostUser(name);
                    break;
                case 2:
                    System.out.print("Texto a buscar: ");
                    String titulo = App.entrada.nextLine();
                    App.filtrar(titulo);
                    break;
                case 6:
                    App.guardarPost();
                    App.guardarUsers();
                    System.out.println("Guardando...");
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
            }
        }
    }
}
