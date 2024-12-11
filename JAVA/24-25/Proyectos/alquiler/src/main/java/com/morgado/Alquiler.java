package com.morgado;
import com.morgado.*;
import java.util.ArrayList;

/**
 * Hello world!
 */
public final class Alquiler {
    private static ArrayList<Vehiculo> Lvehiculos = new ArrayList<>(); 

    private Alquiler() {
    }

    
    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        for (int i=0; i<3; i++){
            Vehiculo vehiculo = new Vehiculo();  
            Alquiler.Lvehiculos.add(vehiculo);
            System.out.println();
        }
        System.out.println("-------- Informes -----------");
        for (Vehiculo vehiculo: Alquiler.Lvehiculos){
            vehiculo.informe();
        }
        Alquiler.maxKm();
    }

    public static void maxKm(){
        int i=0; //coche
        double maxkm=0;
        int pmax = 0;
        for (Vehiculo vehiculo: Alquiler.Lvehiculos){
            if (vehiculo.KmDiaSemana.get(0) > maxkm){
                maxkm = vehiculo.KmDiaSemana.get(0);
                pmax = i;
            }
        }
        System.out.println("el Lunes "+ Alquiler.Lvehiculos.get(pmax).matricula + " ha hecho o " + maxkm);
    }
}
