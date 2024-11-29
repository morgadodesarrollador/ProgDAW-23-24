package biblioteca;

import java.util.Scanner;

public class Autor {
    public  Scanner entrada = new Scanner(System.in); 
    private int autorId;  
    private String nombre;
    private String apellidos;
    private String email;

    //Constructor
    public Autor(int id, String nombre, String apellidos, String email){
        this.autorId(id);
    }

    public add(){
        System.out.print("Id");
        String nombre = this.entrada.next();
        this.setNombre(nombre);
    }
    public setAutorId(int id){
        this.autorId = id;
    }
    public nombre(String nombre){
        this.nombre = nombre;
    }
    public apellidos(String apellidos){
        this.apellidos = apellidos;
    }
    public email(String email){
        this.email = email;
    }
}
