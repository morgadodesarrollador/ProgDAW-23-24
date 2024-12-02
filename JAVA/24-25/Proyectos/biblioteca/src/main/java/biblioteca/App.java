package biblioteca;
import java.util.ArrayList;
import java.util.Scanner;

import biblioteca.Autor;
import biblioteca.Libro;

/**
 * Hello world!
 */
public final class App {
    //1Biblioteca tiene Muchos Autores
    public static ArrayList<Autor> LAutores = new ArrayList<>();
    public static ArrayList<Libro> LLibros = new ArrayList<>();
    public static Scanner entrada = new Scanner(System.in); 

    private App() {
    }
    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        App.insertarAutores();
        App.mostrarAutores();
        System.out.println("-----------------------------");
        App.insertarLibros();
        App.mostrarLibros();
    }
    public static void insertarAutores(){
        int i=1;
        while (i<=2){
            Autor autor = new Autor(i);
            App.LAutores.add(autor);
            i++;
        }
    }
    public static void insertarLibros(){
        int i=10;
        while (i<=11){
            Libro libro = new Libro(i); //PedirDatos()
            System.out.print("Autor del Libro: ");
            int nif = App.entrada.nextInt();
            //Buscar ese nif en la Lista de Autores y devolver el Autor
            Autor autor = App.buscarAutor(nif);
            libro.setAutor(autor);
            autor.setLibros(libro);
            
            App.LLibros.add(libro);
            i++;
        }
    }

    public static void mostrarAutores(){
        for (Autor autor: App.LAutores){
            autor.info();
        }
    }
    public static void mostrarLibros(){
        for (Libro libro: App.LLibros){
            libro.info();
        }
    }

    public static Autor buscarAutor(int codigo){
        Autor autorEncontrado = null;
        for (Autor autor: App.LAutores){
            if (autor.getAutorId() == codigo){
                autorEncontrado = autor;
                // return autor;
            }
        }
        return autorEncontrado;
    }
}
