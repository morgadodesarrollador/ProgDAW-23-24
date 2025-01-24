package com.morgado;
import com.morgado.*;
import java.util.ArrayList;
// import java.util.Scanner;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParser;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import com.google.gson.reflect.TypeToken;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.lang.reflect.Type;


public class App {
    public static ArrayList<Empleado> LEmpleados = new ArrayList<>();
    public static ArrayList<Informe> Informes = new ArrayList<>();

    public static Gson gson = new GsonBuilder().setPrettyPrinting().create();
    public static String ruta = "/Users/morgado/Personal/Modulos/ProgDAW/JAVA/24-25/Proyectos/empresa/public";
    public static  Scanner entrada = new Scanner(System.in); 

    public static void main (String[] args){
      
        // App.lectura1();
        App.load();
        // App.lectura();
        App.Menu();
    }

    public static void Menu(){
        int opcion = -1;

        while (opcion != 0) {
            System.out.println("\n--- Menú de Empleados ---");
            System.out.println("1. Crear Empleado");
            System.out.println("2. Crear Director");
            System.out.println("3. Crear Contable");
            System.out.println("4. Mostrar Empleados");
            System.out.println("5. Mostrar Informes");
            System.out.println("6. Guardar");
            
            
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = App.entrada.nextInt();
            App.entrada.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    Empleado e = new Empleado();
                    LEmpleados.add(e);
                    break;
                case 2:
                    Director d = new Director();
                    LEmpleados.add(d);
                    break;
                case 3:
                    Contable c = new Contable();
                    LEmpleados.add(c);
                    break;
                case 4:
                    App.imprimir();
                    break;
                case 5:
                    
                    break;
                case 6:
                    App.guardar();
                    break;    
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }
    }

    public static void lectura(){
        System.out.println("lectura");
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        try (FileReader reader = new FileReader(App.ruta+"/empresas.json")) {
            // Parsear el JSON como un array
            //JsonElement es la clase abstract en GSon
            JsonElement jsonElement = JsonParser.parseReader(reader);
            for (JsonElement elemento : jsonElement.getAsJsonArray()) {
                //transforma el jsonElement a objJSON (parejas {atributo: valor}) 
                JsonObject objJson = elemento.getAsJsonObject();
                // Obtener el valor del campo "tipo"
                //  objJson.tipo --> no obj java
                String tipo = objJson.get("tipo").getAsString();
                if (tipo.equals("Director")){
                    // System.out.println("Director");
                    //establece clase Director en objJson
                    Director director = gson.fromJson(objJson, Director.class);
                    LEmpleados.add(director);
                } else if (tipo.equals("Contable")){
                    // System.out.println("Contable");
                    //establece clase Contable en objJson
                    Contable contable = gson.fromJson(objJson, Contable.class);
                    LEmpleados.add(contable);
                } else {
                    // System.out.println("Empleado");
                    //establece clase Empleado en objJson
                    Empleado empleado = gson.fromJson(objJson, Empleado.class);
                    LEmpleados.add(empleado);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        App.imprimir();
    }
    public static void lectura1(){
        System.out.println("lectura");
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        ArrayList<Empleado> empleados = new ArrayList<>();
        try (FileReader reader = new FileReader(App.ruta+"/empresas.json")) {
            // Usar TypeToken para deserializar en ArrayList<Empleado>
            Type tipoListaEmpleados = new TypeToken<ArrayList<Empleado>>() {}.getType();
            empleados = gson.fromJson(reader, tipoListaEmpleados);
            for (Empleado empleado: empleados){
                // if (empleado instanceof Director) {
                if (empleado.tipo.equals("Director")){
                    Director director = (Director) empleado;
                    LEmpleados.add(director);
                } else if (empleado instanceof Contable) {
                    Contable contable = (Contable) empleado;
                    LEmpleados.add(contable);
                }else{
                    LEmpleados.add(empleado);
                }
            }
            App.imprimir();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void imprimir(){
        for (Empleado empleado: App.LEmpleados){
            System.out.println(empleado);
        }
    }
    public static void guardar(){
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try (FileWriter writer = new FileWriter(App.ruta+"/empleados.json")) {
            gson.toJson(LEmpleados, writer);
            System.out.println("Archivo empleado.json creado correctamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void informes(){
        for (Empleado empleado: App.LEmpleados){

        }
    }
    public static void load(){
        Empleado e1 = new Empleado("001", "Ana", "ana@gamil.com", 5);
        Contable c1 = new Contable("002", "Juan", "juan@gamil.com", 5, 3);
        Director d1 = new Director("003", "Maria", "maria@gamil.com", 5, 1);
        Director d2 = new Director("004", "Esther", "esther@gamil.com", 15, 2);

        LEmpleados.add(e1);
        LEmpleados.add(c1);
        LEmpleados.add(d1);
        LEmpleados.add(d2);
        
        // c1.contabilizar();
        // System.out.println(d1);
        // d1.analizar();
        
    }

}
