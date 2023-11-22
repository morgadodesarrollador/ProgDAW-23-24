package ficheros;
//import  java.io.FileReader;
//import java.io.BufferedReader;
import java.io.*;
import java.util.ArrayList;
public class FicheroRW {

    public  FicheroRW(String origen, String destino) {
        String linea = "";
        String temp = "";
        int[] datos = new int[2];
        int numlineas=0;
        int totalLetras=0;
        int totalpalabras = 0;
        String rutaO = "/Users/morgado/Modulos/ProgDAW/JAVA/Conceptos/Ficheros/files/" + origen;
        System.out.println("La ruta es " + rutaO);
        String rutaD = "/Users/morgado/Modulos/ProgDAW/JAVA/Conceptos/Ficheros/files/" + destino;
        System.out.println("La ruta es " + rutaD);
        String rutaI = "/Users/morgado/Modulos/ProgDAW/JAVA/Conceptos/Ficheros/files/informe.html" ;
        try {
            //origen
            FileReader fileo = new FileReader(rutaO); //manejador del fichero ---> apunta al inicio del F
            BufferedReader bfileo = new BufferedReader(fileo);
            //destino
            FileWriter filew = new FileWriter(rutaD);
            BufferedWriter bfilew = new BufferedWriter(filew);
            //informe
            FileWriter fileinf = new FileWriter(rutaI);
            BufferedWriter bfileinf = new BufferedWriter(fileinf);
            while (linea != null){
                datos = this.contarLetrasPalabras(linea);
                totalpalabras = totalpalabras + datos[0];
                totalLetras+=datos[1];
                linea = bfileo.readLine();
                if (linea != null){
                    numlineas++;
                    temp = linea
                                .toUpperCase()
                                .replace(" ", "")
                                .replace("\n", "___");

                    //temp = linea.toUpperCase();
                    //temp = temp.replace(" ", "-");

                    bfilew.write(temp + "\n");
                }
            }
            String pagina =
                    "<table border=1> " +
                            "<tr>"+
                                "<th>Total</th>" +
                                "<th>Cantidad</th>" +
                            "</tr>"+
                            "<tr>"+
                                "<th>Lineas</th>" +
                                "<th>"+numlineas+"</th>" +
                            "</tr>" +
                            "<tr>"+
                                    "<th>Palabras</th>" +
                                    "<th>"+totalpalabras+"</th>"+
                            "</tr>"+
                                    "<tr>"+
                                    "<th>Letras</th>" +
                                    "<th>"+totalLetras+"</th>" +
                            "</table>";
/*
                            bfileinf.write("<h2>Total lineas = " + numlineas+"\n");
            bfileinf.write("Total Palabras = " + totalpalabras+"\n");
            bfileinf.write("Total Letras = " + totalLetras+"\n");*/
            bfileinf.write(pagina);

            bfileinf.close();
            bfilew.close();
            bfileo.close();
        }catch (IOException ioe){
            System.out.println("Error de manejo de ficheros");
        }
    }

    public int[] contarLetrasPalabras(String linea){
        int[] datos = new int[2];
        int nletras = 0;
        int npalabras = 0;
        String[] palabras = linea.split(" ");
        npalabras = palabras.length;
        for (int i=0; i<palabras.length; i++){
            nletras+=palabras[i].length();
        }
        /*
        for (int i=0; i<linea.length(); i++){
            if ((linea.charAt(i) != ' ') || (linea.charAt(i) != ',') || (linea.charAt(i) != '.')) {
                nletras++;
            }
        }
        */

        datos[0] = npalabras;
        datos[1] = nletras;
        return datos;
    }
}
