package vehiculo;

import persona.*;

public class Vehiculo {
    public static void main(String[] args){

        Persona p = new Persona("Ana","Almeria", 1972);
        p.nombre = "morgado";
        // p.fnac = 2020;
        System.out.println("Nombre: " + p.nombre);
        System.out.println("Ciudad: " + p.ciudad);
        // System.out.println(p.fnac);
        System.out.println("Edad: " + p.obtenerEdad(2023));
    }
}
