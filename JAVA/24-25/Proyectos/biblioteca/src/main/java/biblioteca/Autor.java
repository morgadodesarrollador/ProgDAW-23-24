package biblioteca;

import java.util.Scanner;

public class Autor {
    public  Scanner entrada = new Scanner(System.in); 
    private int autorId;  
    private String nombre;
    private String apellidos;
    private String email;

    //Constructor
    public Autor(int id){
        this.setAutorId(id);
        this.PedirDatos();
    }
    // public Autor(int id, String nombre, String apellidos, String email){
    //     this.setAutorId(id);
    //     this.setNombre(nombre);
    //     this.setApellidos(apellidos);
    //     this.setEmail(email);
    // }

    //La clase Autor pide los datos por teclado
    public void PedirDatos(){
        // System.out.print("Id: ");
        // int id = this.entrada.nextInt();
        // this.setAutorId(id);
        System.out.println("Autor con Id: " + this.autorId);
        System.out.println("-----------------------------");
        System.out.print("Nombre: ");
        String nombre = this.entrada.next();
        this.setNombre(nombre);

        System.out.print("Apellidos: ");
        String apellidos = this.entrada.next();
        this.setApellidos(apellidos);
        
        System.out.print("Correo: ");
        String correo = this.entrada.next();
        this.setEmail(correo);
    }
    public void setAutorId(int id){
        this.autorId = id;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public String getNombre(){
        return this.nombre.toUpperCase();
    }
    //resto de get 

    public String getNombreCompleto(){
        return this.nombre.toUpperCase() + ", " + this.apellidos.toUpperCase();
    }
    public void info(){
        System.out.println("Datos del Autor "+ this.getNombreCompleto() + " : ");
        System.out.println("Id: " + this.autorId);
        System.out.println("Correo: " + this.email);
    }
    // public String toStrng(){}
}
