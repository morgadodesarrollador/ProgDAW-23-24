package com.morgado;
//mias
import com.morgado.Post;
//java
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.lang.reflect.Type;

//terceros
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

//para hacer peticiones HTTP (get, post ...)  a una servidor web
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;



public class App 
{
    public static ArrayList<Post> LPost = new ArrayList<>();
    public static  Scanner entrada = new Scanner(System.in); 
    public static OkHttpClient client = new OkHttpClient(); 
    public static String urlRoot = "https://jsonplaceholder.typicode.com/"; 
    public static void main( String[] args )
    {
        App.Menu();
    }

    public static void CargarPost(){
        //Crea la REQUEST Http de tipo Get
        Request request = new Request.Builder()
                                .url(App.urlRoot + "posts")
                                .build();
        //Ejecutar la solicitud --> send
        System.out.println("Enviando ..."+ App.urlRoot + "posts");
        try (Response response = client.newCall(request).execute() ) {
            if (!response.isSuccessful()){
                System.out.println("Response Fallido");
                throw new IOException("Unexpected code "+ response);
            }
            System.out.println("Conexión Establedida y Response ok");
            String responseBody = response.body().string();
            Gson gson = new Gson();
            Type postListType = new TypeToken<List<Post>>() {}.getType();
            List<Post> LPost = gson.fromJson(responseBody, postListType);
            for (Post post : LPost) {
                System.out.println(post.getId());
            }
                        
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void Menu(){
        int opcion = -1;

        while (opcion != 0) {
            System.out.println("\n--- Menú de Empleados ---");
            System.out.println("1. Cargar los Post");
            System.out.println("2. Cargar Usuarios");
    

            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = App.entrada.nextInt();
            App.entrada.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    App.CargarPost();
                    System.out.println("termino");
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
            }
        }
    }
}
