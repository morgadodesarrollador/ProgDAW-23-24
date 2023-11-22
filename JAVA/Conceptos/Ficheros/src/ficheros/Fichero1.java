package ficheros;

import  java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class Fichero1 {

    public Fichero1 (String archivo){
        int npalabras = 0;
        int numlineas = 0;
        String[] palabras;
        ArrayList<Integer> PalabrasLinea = new ArrayList<Integer>();

        String ruta = "/Users/morgado/Modulos/ProgDAW/JAVA/Conceptos/Ficheros/files/" + archivo;
        System.out.println("La ruta es " + ruta);
        try{
            FileReader file = new FileReader(ruta);
            BufferedReader brfile = new BufferedReader(file);
            String linea = "";
            String union;
            System.out.println("Lectura de Fichero");
            System.out.println("-----------------------");

            while (linea != null){
                numlineas++;
                linea = brfile.readLine();
                if (linea != null){
                    // union = linea.concat("XXX");
                    //   System.out.println("L"+numlineas + " --> "+ linea.concat("XXX"));
                    //     if (linea.endsWith("."))
                    //    System.out.println("L"+numlineas + " --> "+ linea);
                    // System.out.println("L"+numlineas + " --> "+ linea.replace(" ", "-"));
                    // System.out.println("L"+numlineas + " --> "+ linea.toUpperCase());
                //    System.out.println("L"+numlineas + " --> "+ linea);
                    palabras = linea.split(" ");
                    npalabras = palabras.length;
                    PalabrasLinea.add(npalabras);
                    System.out.println("L"+numlineas + "/"+ npalabras + " --> "+ linea);
                }
            }
            brfile.close();
            for (int i=0; i<PalabrasLinea.size(); i++){
                System.out.print(PalabrasLinea.get(i) + "/");
            }

        }catch (IOException ioe){
            System.out.println("No se puede abrir el archivo " + archivo);
        }


    }

}
