package aemet;
import aemet.RegCiudad;

import java.util.Scanner;

public class Aemet1 {
    public static final int NCIUDADES = 3;
    private static String[] ciudades = { "Almeria", "Granada", "Cadiz", "Malaga", "Jaen", "Cordoba", "Huelva", "Sevilla"};
    private static String[] dias = { "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo" };

    public static Scanner entrada = new Scanner(System.in); 
    public static RegCiudad[] registroTemp = new RegCiudad[NCIUDADES] ;

    public static void main (String[] args){
        Aemet1.GenerarRegitroTemp();
       
    }

    public static void GenerarRegitroTemp(){
    
        RegCiudad1 ciudad = new RegCiudad1("Almeria");

     }


   

}
