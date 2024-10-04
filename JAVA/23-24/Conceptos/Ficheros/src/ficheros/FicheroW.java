package ficheros;
//import  java.io.FileReader;
//import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.File;
import  java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
public class FicheroW {

    public FicheroW(String archivo){
        String ruta = "/Users/morgado/Modulos/ProgDAW/JAVA/Conceptos/Ficheros/files/" + archivo;
        System.out.println("La ruta es " + ruta);
        try {
            FileWriter file = new FileWriter(ruta);
            BufferedWriter bwfile = new BufferedWriter(file);

            bwfile.write("Fruta\t\tStock\n");
            bwfile.write("----------------------\n");
            bwfile.write("Naranja\t\t1000Kg\n");
            bwfile.write("Mango\t\t1500Kg\n");
            bwfile.write("Chirimoya\t\t800Kg\n");
            String linea = "";
            for (int i=0; i<50; i++){
                linea = "Nota "+i+ " :\t" + Math.floor(Math.random()*10)+ "\n";
                bwfile.write(linea);
            }
            bwfile.close();
        }catch (IOException ioe){
            System.out.println ("No se puede guardar el fichero " + ruta);
        }
    }
}
