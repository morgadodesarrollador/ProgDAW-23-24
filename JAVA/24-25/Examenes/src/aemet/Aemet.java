package aemet;
import aemet.RegCiudad;

import java.util.Scanner;

public class Aemet {
    public static final int NCIUDADES = 3;
    private static String[] ciudades = { "Almeria", "Granada", "Cadiz", "Malaga", "Jaen", "Cordoba", "Huelva", "Sevilla"};
    private static String[] dias = { "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo" };

    public static Scanner entrada = new Scanner(System.in); 
    public static RegCiudad[] registroTemp = new RegCiudad[NCIUDADES] ;

    public static void main (String[] args){
        Aemet.GenerarRegitroTemp();
        Aemet.ListarRegistroTemp();
        // Aemet.MostrarDatosDia("Martes", "Granada");
        Aemet.getCiudadTempMax("Jueves");
        // System.out.print(Aemet.registroTemp[1]);
    }

    public static void GenerarRegitroTemp(){
        int vmax; int vmin;
        for (int i=0; i<NCIUDADES; i++){
            // System.out.println(ciudades[i]+ ": ");
            // System.out.print("  - Vmax: ");
            // vmax = Aemet.entrada.nextInt();
            // System.out.print("  - Vmin: ");
            // vmin = Aemet.entrada.nextInt();
            // registroTemp[i] = new RegCiudad(Aemet.ciudades[i], vmax, vmin);
            registroTemp[i] = new RegCiudad(Aemet.ciudades[i]);

        }
    }

    public static void ListarRegistroTemp(){
        System.out.println();
        for (int i=0; i<NCIUDADES; i++){
            // System.out.print(Aemet.registroTemp[i]);
            Aemet.registroTemp[i].mostrarTabla();;
        }
    }

    public static void MostrarDatosDia(String dia, String ciudad){
        int ICiudad = Aemet.getIndexCiudad(ciudad);
        int[] datos = Aemet.registroTemp[ICiudad].getDatosDia(dia);
        System.out.println();
        System.out.println("Datos del " + dia + " en " + ciudad);
        System.out.println("\tTMax: "+ datos[0] + ", "  +
                           "TMin:" + datos[1] + ", "  +
                           "TMedia: " + datos[2]);
    }

    public static int getIndexCiudad(String ciudad){
        int index = -1; // sup que no se encuentra
        for(int i=0; (i<NCIUDADES) && (index == -1); i++){ //ejecuto mientras no se encuentre
            if (Aemet.ciudades[i]== ciudad){
                index = i;
            }
        }
        return index;
    }

    public static void getCiudadTempMax(String dia){
        int[] datos;
        int pmax = 0;
        int max = Aemet.registroTemp[0].getDatosDia(dia)[0];
        for (int i=0; i<NCIUDADES; i++){
            datos = Aemet.registroTemp[i].getDatosDia(dia);
            if (datos[0] > max){
                max = datos[0];
                pmax = i; 
            }
        }
         
        System.out.println("El " + dia 
                            + " en  " + Aemet.ciudades[pmax] 
                            + " se alcanza la maxima de "+max );
        

    }

}
