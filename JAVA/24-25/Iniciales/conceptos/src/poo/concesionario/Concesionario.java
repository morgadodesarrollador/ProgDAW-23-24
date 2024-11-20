package poo.concesionario;
import java.util.Scanner;

import poo.concesionario.Vehiculo;
// import poo.notas.Alumnos;

public class Concesionario {
    public static int NVEHICULOS = 2;
    public static Scanner entrada = new Scanner(System.in); 
    public static Vehiculo[] vehiculos = new Vehiculo[NVEHICULOS] ;

    public static void main (String[] args){
       Concesionario.lecturaVehiculos();
       Concesionario.ImprimirVehiculos();
       Concesionario.kmTotalesFlota();
       Concesionario.kmTotalesDia();
       
    }

    public static void kmTotalesDia(){
        System.out.print("Dia: ");
        int dia = Concesionario.entrada.nextInt();
        int suma = 0;
        for (int i=0; i<NVEHICULOS; i++){
            suma+=vehiculos[i].kmDia(dia);
        }
        System.out.println("En el dia " + dia + "  se hacen " + suma + " km");
    }
    public static void kmTotalesFlota(){
        double suma = 0;
        for (int i=0; i<NVEHICULOS; i++){
            System.out.println("v"+(i+1)+": "+ vehiculos[i].kmTotales);
            suma += vehiculos[i].kmTotales;
        }
        System.out.println("Km Flota : " + suma);

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
            vehiculos[i].generarKmSemana();
       }
    }
}
