package arrays;
import java.util.Scanner;
//NO SE IMPORTA LA CLASE Math

public class unaDim {
    public static Scanner entrada = new Scanner(System.in); 
    static int ALUMNOS = 5;
    static int ASIGNATURAS = 4;
    static int TRIMESTRES = 2;
    
    static String[] alumnos1 = new String[ALUMNOS];
    //Array de 5 alumnos de manera estática
    static String[] alumnos = { "Jose", "Ana", "Maria", "Luis", "Noelia" };
    
    public static void main(String[] args){

        //generar 10 notas aleatorias con dos decimales
        // unaDim.pedirNombres();
        unaDim.generarNotas();
        //leer ALUMNOS notas por teclado
        //unaDim.notasTeclado();
    }
    public static void pedirNombres(){
        for (int i=0; i<unaDim.ALUMNOS; i++){
            System.out.print("Nombre Alumno " + (i+1) + ": ");
            unaDim.alumnos[i] = unaDim.entrada.next();
        }
    }

    public static void generarNotas(){
        double notas[] = new double[ALUMNOS];
        double temp = 0.0;
        double max = 0; int pmax = 0; int pmin = 0;
        double min = 0;
        double media = 0;
        System.out.println("----- Generación de Notas ------");
        for (int i=0; i<unaDim.ALUMNOS; i++){
            temp = Math.random()*10;
            temp = Math.round(temp*100.00)/100.00;
            notas[i] = temp;
        }
        System.out.println("----- Impresion de Notas ------");
        for (int i = 0; i<unaDim.ALUMNOS; i++){
            System.out.println("nota de " + unaDim.alumnos[i] +  " : " + notas[i]);
        }
        System.out.println("----- Informes de Resultados --------");
        //suposicion
        max = notas[0];
        min = notas[0];
        //sip que se alcanzan en la posicion 0
        pmax = 0;
        pmin = 0;
        for (int i=0; i<unaDim.ALUMNOS; i++){
            media = media + notas[i];
            if (notas[i]>max){
                max = notas[i];
                pmax = i;
            }
            if (notas[i]<min){
                min = notas[i];
                pmin = i;
            }
        }
        System.out.println("Max :  " + max + " ( " + pmax + ")" + " y es de " + unaDim.alumnos[pmax]);
        System.out.println("Min :  " + min + " ( " + pmin + ")" + " y es de " + unaDim.alumnos[pmin]);
        media = media / unaDim.ALUMNOS;
        System.out.println("Media : " + media);
        
    }

    public static void notasTeclado(){
        
        int[] notas = new int[ALUMNOS]; //0..4 indice's del array
        System.out.println("----- Lectura de Notas ------");
        for (int i = 0; i<ALUMNOS; i++){ //0..5 indice del for
            System.out.print("Introduce nota " + i + " : ");
            notas[i] = unaDim.entrada.nextInt();
        }
        System.out.println("----- Impresion de Notas ------");
        for (int i = 0; i<ALUMNOS; i++){
            System.out.print("nota " + i + " : " + notas[i]);
        }

    }

    public static void explicacion(){
        //almacenar array de notas (enteros) de 10 alumnos
        int nota = 9; //v. monovaluada (2bytes)
        // notas --> (array [] --> v.multivaluada)
        //se usa el operador new() --> RESERVA EN T.COMPILACION(ESTATICA) 10 posiciones
        //ENTERAS de memoria RAM int-->2 bytes --> notas ocupa 20 bytes
        //----- DECLARACION DEL ARRAY (NO INICIALIZO)
        int[] notas = new int[10]; //notas[0] ... notas[9]{0, ...., 0}
        // int[] notas1 = { 2,5,7,1,6,8,9,10,0,4 };

        //array 2D Bidimensional (tabla) (alumnos/asignaturas)
        int[][] notas2 = new int[4][5]; //5f y 6c
        notas2[0][0] = 3;
        //...
        notas2[0][4] = 7;
        notas2[1][0] = 6;
        //...
        notas2[1][4] = 7;
        //...
        notas2[3][0] = 3;
        notas2[3][4] = 7;
        
        //array 3D Tridimensional (cubo) (alumnos/asignaturas/trimestres)
        int[][][] notas3 = new int[ALUMNOS][ASIGNATURAS][TRIMESTRES]; //5f, 6c, 3prof
        notas3[2][1][2] = 5;
    }
   

    

    

    
} //cierra la clase

