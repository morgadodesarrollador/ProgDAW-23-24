package poo.concesionario;
import java.util.Scanner;

import poo.concesionario.Vehiculo;

public class Concesionario {
    public static int NVEHICULOS = 3;
    public static Scanner entrada = new Scanner(System.in); 
    public static Vehiculo[] vehiculos = new Vehiculo[NVEHICULOS] ;

    public static void main (String[] args){
       Concesionario.lecturaVehiculos();
       Concesionario.ImprimirVehiculos();
       
    }

    public static void ImprimirVehiculos(){
        for (int i=0; i<NVEHICULOS; i++){
            System.out.println(vehiculos[i]);
           }
    }
    public static void lecturaVehiculos(){
        String marca; String modelo; int velocidad;
        //*** entrada de da */
       for (int i=0; i<NVEHICULOS; i++){
            System.out.print("Marca vehiculo " + (i+1) + " : ");
            marca = Concesionario.entrada.next();
            System.out.print("Modelo vehiculo " + (i+1) + " : ");
            modelo = Concesionario.entrada.next();
            System.out.print("Velocidad vehiculo " + (i+1) + " : ");
            velocidad = Concesionario.entrada.nextInt();
            vehiculos[i] = new Vehiculo(marca, modelo, velocidad);
       }
    }
}
