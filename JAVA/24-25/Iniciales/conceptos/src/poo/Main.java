package poo;
import poo.Vehiculo;

public class Main {
    public static void main (String[] args){
        //crear objeto o instancia
        Vehiculo v1 = new Vehiculo();
        v1.setMarca("Peugeot");
        v1.setModelo("206");
        Vehiculo v2 = new Vehiculo();
        v2.setMarca("Audi");
        v2.setModelo("A3");

        // System.out.println("Vehiculo1: " + v1.getMarca() + " " + v1.getModelo());
        // System.out.println("Vehiculo2: " + v2.getMarca() + " " + v2.getModelo());
        v1.Info();
        v2.Info();
        System.out.println(v1);
        System.out.println(v2);

    }
}
