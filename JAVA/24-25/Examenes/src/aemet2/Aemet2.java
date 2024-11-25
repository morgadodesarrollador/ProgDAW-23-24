package aemet2;
import aemet2.RegCiudad2;

import java.util.Scanner;

public class Aemet2 {
    public static final int NCIUDADES = 3;
    private static String[] ciudades = { "Almeria", "Granada", "Cadiz", "Malaga", "Jaen", "Cordoba", "Huelva", "Sevilla"};
   
    public static Scanner entrada = new Scanner(System.in); 
    
    public static RegCiudad2[] regTemperaturas = new RegCiudad2[NCIUDADES];
 

    public static void main (String[] args){
      Aemet2.GenerarRegitroTemp();
      Aemet2.ListarRegistroTemperaturas();
    }

    public static void GenerarRegitroTemp(){
        int vmax; int vmin;
        for (int i = 0; i<NCIUDADES; i++){
            System.out.println(ciudades[i] + ": ");
            System.out.print("  Vmax: ");
            vmax = Aemet2.entrada.nextInt();
            System.out.print("  Vmin: ");
            vmin = Aemet2.entrada.nextInt();
            Aemet2.regTemperaturas[i] = new RegCiudad2(ciudades[i], vmin, vmax);

        }
    }
    public static void ListarRegistroTemperaturas(){
        for (int i=0; i<NCIUDADES; i++){
            Aemet2.regTemperaturas[i].mostrarTabla();
        }
    }

    
}
