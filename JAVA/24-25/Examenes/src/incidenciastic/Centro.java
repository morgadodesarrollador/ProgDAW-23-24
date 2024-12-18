package incidenciastic;
import incidenciastic.*;

import java.util.ArrayList;
import java.util.Scanner;

import gestic.Aparato;

import java.io.IOException;


public class Centro {
    public static ArrayList<Profesor> LProfesores = new ArrayList<>();
    public static ArrayList<Aparato> LAparatos = new ArrayList<>();
    public static ArrayList<Incidencia> LIncidencias = new ArrayList<>();
    public static Scanner entrada = new Scanner(System.in); 


    public static void main(String[] args) throws Exception {
        // Centro.loadData();
        // Centro.historialIncidencias();
        // Centro.getIncidenciasProfesor("123B");
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

    public static void loadData(){
        Profesor profesor = new Profesor("123A", "Ana", "MAT");
        Centro.LProfesores.add(profesor);
        profesor = new Profesor("123B", "Antonio", "MAT");
        Centro.LProfesores.add(profesor);
        profesor = new Profesor("123C", "Maria", "EFI");
        Centro.LProfesores.add(profesor);
        profesor = new Profesor("123D", "Juan", "MAT");
        Centro.LProfesores.add(profesor);
        profesor = new Profesor("123E", "Claudia", "TIC");
        Centro.LProfesores.add(profesor);
        Centro.listadoProfesores();

        Aparato aparato = new Aparato("PRA7", "Proyector", "A7");
        Centro.LAparatos.add(aparato);
        aparato = new Aparato("PIZA7", "Pizarra Digital", "A7");
        Centro.LAparatos.add(aparato);
        aparato = new Aparato("ORA7", "Ordenador", "A8");
        Centro.LAparatos.add(aparato);
        aparato = new Aparato("ORA8", "Ordenador", "A7");
        Centro.LAparatos.add(aparato);
        aparato = new Aparato("PRA8", "Proyector", "A8");
        Centro.LAparatos.add(aparato);
        aparato = new Aparato("PRA9", "Proyector", "A9");
        Centro.LAparatos.add(aparato);
        aparato = new Aparato("PIZA9", "Pizarra Digital", "A9");
        Centro.LAparatos.add(aparato);
        aparato = new Aparato("ORA9", "Ordenador", "A9");
        Centro.LAparatos.add(aparato);
        Centro.listadoAparatos();
    }

    public static void historialIncidencias(){
    // pedimos codigoInc, titulo, nif, codAp
        String nif="123A";
        String codAp="ORA9";
        Aparato aparato = Centro.getAparato(codAp);
        Profesor profesor = Centro.getProfesor(nif);
        Incidencia incidencia = 
            new Incidencia(1, "proyector del aula A7 no enfoca correctamente", 
                           aparato, profesor);
        Centro.LIncidencias.add(incidencia);
        profesor.incidencias.add(incidencia);
        aparato.incidencias.add(incidencia);
        incidencia.setEstado("Pendiente");
        aparato.setEstado(false);

        aparato = Centro.getAparato("PRA7");
        Profesor antonio = Centro.getProfesor("123B");
        incidencia = new Incidencia(2, "el ordenador del aula A9 no arranca", aparato, antonio);
        Centro.LIncidencias.add(incidencia);
        antonio.incidencias.add(incidencia);
        // aparato.incidencias.add(incidencia);
        // Centro.listadoIncidencias();
        aparato = Centro.getAparato("ORA7");
        incidencia = new Incidencia(2, "el ordenador del aula A7 no arranca", aparato, ana);
        Centro.LIncidencias.add(incidencia);
        ana.incidencias.add(incidencia);
        // aparato.incidencias.add(incidencia);

        //resolver incidencias
        Incidencia rincidencia = Centro.getIncidencia(2);
        rincidencia.resolver("Cambia la bateria del ordenador A9", 1500);

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
        for (Incidencia i: Centro.LIncidencias){
            System.out.println(i.info());
        }
    }

    public static Aparato getAparato(String codigo){
        for (Aparato a: Centro.LAparatos){
            if (a.getCodigo().equals(codigo)){
                return a;
            }
        }
        return null;
    }
    public static Profesor getProfesor(String nif){
        for (Profesor p: Centro.LProfesores){
            if (p.getNif().equals(nif)){
                return p;
            }
        }
        return null;
    }
    public static Incidencia getIncidencia(int codigo){
        for (Incidencia i: Centro.LIncidencias){
            if (i.getCodigo() == codigo){
                return i;
            }
        }
        return null;
    }

    public static void getIncidenciasProfesor(String nif){
        Profesor profesor = Centro.getProfesor(nif);
        System.out.println(profesor.getNombre());
        for (Incidencia i: profesor.incidencias){
            System.out.println("--> "+ i.info());
        }
    }

    public static void ClearConsole() {
            // Código ANSI para borrar la consola
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }
    }
}

