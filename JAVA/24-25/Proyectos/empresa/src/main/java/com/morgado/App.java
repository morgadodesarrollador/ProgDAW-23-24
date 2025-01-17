package com.morgado;
import com.morgado.*;
import java.util.ArrayList;
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
    public static Gson gson = new GsonBuilder().setPrettyPrinting().create();
    public static String ruta = "/Users/morgado/Personal/Modulos/ProgDAW/JAVA/24-25/Proyectos/empresa/public";

    public static void main (String[] args){
      
        // App.lectura1();
        // App.load();
        App.lectura();
        
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
        try (FileWriter writer = new FileWriter(App.ruta+"/empresas.json")) {
            gson.toJson(LEmpleados, writer);
            System.out.println("Archivo empleado.json creado correctamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void load(){
        Empleado e1 = new Empleado("001", "Ana", "ana@gamil.com", 5);
        Contable c1 = new Contable("002", "Juan", "juan@gamil.com", 5);
        Director d1 = new Director("003", "Maria", "maria@gamil.com", 5, 1);
        Director d2 = new Director("004", "Esther", "esther@gamil.com", 15, 2);

        LEmpleados.add(e1);
        LEmpleados.add(c1);
        LEmpleados.add(d1);
        LEmpleados.add(d2);
        
        c1.contabilizar();
        System.out.println(d1);
        d1.analizar();
        App.guardar();
    }

}
