
package gestic;
import gestic.Aparato;
import gestic.Profesor;
import gestic.Incidencia;

import java.util.ArrayList;
import java.util.Scanner;

public class Centro {
    public static Scanner entrada = new Scanner(System.in); 
    //Peticios a una API y traerme estos datos (profesores, aparatos, incidencias)
    public static ArrayList<Profesor> LProfesores = new ArrayList<>();
    public static ArrayList<Aparato> LAparatos = new ArrayList<>();
    public static ArrayList<Incidencia> LIncidencais = new ArrayList<>();

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
            System.out.println("4-. Listar Incidencias");
            System.out.println("5-. Nueva Incidencia");
            System.out.println("6-. Resolver Incidencia");
            System.out.println("7-. Incidencias de un Aparato");
            System.out.println("8-. Incidencias de un profesor");
            System.out.println("0-. Salir");
            System.out.print("Elija Opcion: ");
            opcion = Centro.entrada.next().charAt(0);

            switch (opcion){
                case '1': 
                    Centro.loadData();
                    break;
                case '2':
                    Centro.listadoProfesores();
                    break;
                case '3':
                    Centro.listadoAparatos();
                    break;    
                case '4':
                    Centro.listadoIncidencias();
                    break;    
                case '5':
                    Centro.NuevaIncidencia();
                    break; 
                case '8':
                    System.out.println("Nif profesor: ");
                    String nif = Centro.entrada.next();
                    Centro.getIncidenciasProfesor(nif);
                    break;   
            }
            Centro.ClearConsole();

        }

    }
    public static void ResolverIncidencia(){
        //pido por teclado el codInc de la Incidencia
        //pido precio y resolucion
        //busco el incidencia=getIncidencia(codInc) en LIncidencias
        //incidencia.resolver(precio, resolucion)
        
    }

    public static void NuevaIncidencia(){
        System.out.print("Codigo Inc: ");
        int codigo = Centro.entrada.nextInt();
        Centro.entrada.nextLine();
        System.out.print("Titulo Inc: ");
        String titulo = Centro.entrada.nextLine();
        System.out.print("Nif Profesor: ");
        String nif = Centro.entrada.nextLine();
        System.out.print("Cod Aparato: ");
        String codap = Centro.entrada.nextLine();
        System.out.println();
        Aparato aparato = Centro.getAparato(codap);
        Profesor profesor = Centro.getProfesor(nif);
        Incidencia incidencia = new Incidencia(codigo, titulo, aparato, profesor);
        //se rellenan las listas aparato.incidencias y profesor.incidencias
        aparato.addIncidencia(incidencia);
        profesor.addIncidencia(incidencia);
        //se reallena LIncidencias
        Centro.LIncidencais.add(incidencia);
        
    }

    //métodos de búsqueda
    public static Aparato getAparato(String codap){
        for (Aparato aparato: Centro.LAparatos){
            if (aparato.getCodigo().equals(codap)){
                return aparato;
            }
        }
        return null;
        
    }
    public static Profesor getProfesor(String nif){
        for (Profesor profesor: Centro.LProfesores){
            if (profesor.getNif().equals(nif)){
                return profesor;
            }
        }
        return null;
    }
    public static void getIncidenciasProfesor(String nif){
        Profesor profesor = Centro.getProfesor(nif);
        System.out.println(profesor.getNombre());
        for (Incidencia i: profesor.getIncidencias()){
            System.out.println("--> "+ i.info());
        }
    }
    public static void listadoProfesores(){
        for (Profesor p: Centro.LProfesores){
            System.out.println(p.info());
        }
    }

    public static void listadoAparatos(){
        for (Aparato a: Centro.LAparatos){
            System.out.println(a.info());
        }
    }
    public static void listadoIncidencias(){
        for (Incidencia i: Centro.LIncidencais){
            System.out.println(i.info());
        }
    }
    public static void loadData(){
        Centro.LAparatos.clear();
        Centro.LProfesores.clear();
        Centro.LIncidencais.clear();
        Centro.LProfesores.add(new Profesor("123A", "Ana", "MAT"));
        Centro.LProfesores.add(new Profesor("123B", "Antonio", "MAT"));
        Centro.LProfesores.add(new Profesor("123C", "Maria", "EFI"));
        Centro.LProfesores.add(new Profesor("123D", "Juan", "MAT"));
        Centro.LProfesores.add(new Profesor("123E", "Claudia", "TIC"));
        // Centro.listadoProfesores();

        Centro.LAparatos.add(new Aparato("PRA7", "Proyector", "A7"));
        Centro.LAparatos.add(new Aparato("PIZA7", "Pizarra Digital", "A7"));
        Centro.LAparatos.add(new Aparato("ORA7", "Ordenador", "A8"));
        Centro.LAparatos.add(new Aparato("ORA8", "Ordenador", "A7"));
        Centro.LAparatos.add(new Aparato("PRA8", "Proyector", "A8"));
        Centro.LAparatos.add(new Aparato("PRA9", "Proyector", "A9"));
        Centro.LAparatos.add(new Aparato("PIZA9", "Pizarra Digital", "A9"));
        Centro.LAparatos.add(new Aparato("ORA9", "Ordenador", "A9"));
        // Centro.listadoAparatos();
        // char opcion = Centro.entrada.next().charAt(0);
    }
    
    public static void ClearConsole() {
        // Código ANSI para borrar la consola
        char opcion = Centro.entrada.next().charAt(0);
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}

