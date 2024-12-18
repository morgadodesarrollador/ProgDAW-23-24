
package gestic;
import gestic.Aparato;
import gestic.Profesor;
import gestic.Incidencia;

import java.util.ArrayList;
import java.util.Scanner;

public class Centro {
    public static ArrayList<Profesor> LProfesores = new ArrayList<>();
    public static ArrayList<Aparato> LAparatos = new ArrayList<>();
    public static ArrayList<Incidencia> LIncidencias = new ArrayList<>();
    public static Scanner entrada = new Scanner(System.in); 

    public static void main(String[] args) throws Exception {
        Centro.Menu();
    }

    public static void Menu(){
        char opcion;

        opcion='1';
        while (opcion != '0'){
            System.out.println("1-. Cargar Datos");
            System.out.println("2-. Listar Profesores");
            System.out.println("3-. Listar Aparatos");
            System.out.println("4-. Nueva Incidencia");
            System.out.println("5-. Resolver Incidencia");
            System.out.println("6-. Listar Incidencias");
            System.out.println("7-. Incidencias de un Aparato");
            System.out.println("8-. Incidencias de un profesor");
            System.out.println("0-. Salir");
            opcion = Centro.entrada.next().charAt(0);
            ClearConsole();
        }

    }

    public static void ClearConsole() {
        // Código ANSI para borrar la consola
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}

