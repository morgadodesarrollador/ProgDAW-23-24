package arrays;
import java.util.Scanner;

public class Notas {
    public static Scanner entrada = new Scanner(System.in); 
    static int ALUMNOS = 5;
    static int MODULOS = 4;
    static String[] alumnos = { "Jose", "Ana", "Maria", "Luis", "Noelia" };
    static String[] modulos = { "Programacion", "Redes", "Bases de Datos",  "Desarrollo Servidor" };
    static int[][] notas = new int[ALUMNOS][MODULOS];
    

    public static void main(String[] args){
        // Notas.LecturaNotas();
        // Notas.ImprimirNotas();

        Notas.GenerarNotas();
        Notas.ImprimirNotasTabla();
    }

    public static void LecturaNotas(){
        //recorrido de alumnos
        for (int i=0; i<ALUMNOS; i++){
            System.out.println("Nota de " + alumnos[i] + " : "); //1
            for (int j=0; j<MODULOS; j++){
                System.out.print("   - " + modulos[j] + " : "); //1
                // System.out.println("Nota de "+ alumnos[i] + " - " + modulos[j] + " : "); //2
                //lectura por teclado
                Notas.notas[i][j]=Notas.entrada.nextInt();
            }
        }
    }
    public static void GenerarNotas(){
        //recorrido de alumnos
        for (int i=0; i<ALUMNOS; i++){
            for (int j=0; j<MODULOS; j++){
                Notas.notas[i][j]=(int)Math.random()*10;
            }
        }
    }

    public static void ImprimirNotasTabla(){
        System.out.println("------ LISTADO DE NOTAS --------------");
        for (int i=0; i<ALUMNOS; i++){
            System.out.print("             " + alumnos[i] + "  ");
        }
        for (int i=0; i<ALUMNOS; i++){
            for (int j=0; j<MODULOS; j++){
                System.out.print("               " + notas[i][j]+ "        ");
            }
            System.out.println();
        }
    }

    public static void ImprimirNotas(){
        System.out.println("------ LISTADO DE NOTAS --------------");
       
        for (int i=0; i<ALUMNOS; i++){
            for (int j=0; j<MODULOS; j++){
                System.out.println("Nota de "+ alumnos[i] + " - " + modulos[j] + " : " + notas[i][j]) ; //2
            }
        }
    }

}
