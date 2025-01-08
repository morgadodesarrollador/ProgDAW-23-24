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
       // App.mostrarAutores();
        System.out.println("-----------------------------");
        App.insertarLibros();
        App.mostrarLibros();
        App.librosAutor(2);
    }
    /*
      10-. Editorial con mayor numero de libros 
            suponer un array de editoriales
    */

    //9-. Numero de libros "prestados" de "McGrawHill"

    //8- Que autor tiene más libros "prestados"

    //7-. Verificar si el libro "React Avanzado" de "Anaya" está "prestado"

    //6-. Precio medio de los libros de cada Categoria

    //5-. El libro más barato de Paraninfo

    //4-. El libro más caro de un Autor

    //3-. Los libros de Programacion de Paraninfo mayores de 50€

    //2-. Los libros de Anaya 
    public static ArrayList<Libro> librosEditorial(String ed){
        ArrayList<Libro> listaLibros = new ArrayList<>();
        for (Autor autor: App.LAutores){
            if (autor.editorial.equals(ed)){
                listaLibros.addAll(0,listaLibros) ;
            }
        }
        return listaLibros;
    }

    
    public static ArrayList<Libro> librosEditorial1(String ed){
        ArrayList<Libro> listaLibros = new ArrayList<>();
        for (Libro libro: App.LLibros){
            if (libro.getAutor().editorial.equals(ed)){
                listaLibros.add(libro);
            }
        }

        return listaLibros;
    }

    //1-. Info Los Autores que tienen libros de Redes
    // ----------- librosCategoria("Redes") --------------
    public static void libroscategoria(String cat){
        //con la RI de Autor
        //recorriendo los Autores ?
        for (Autor autor: App.LAutores){
            for (Libro libro: autor.getLibros()){
                if (libro.categoria.equals(cat)){
                    autor.info();
                }
            }
        }
    }
   
    public static void librosCategoria1(String cat){
        //sin la RI en Autor
        for (Libro libro: App.LLibros){
            if (libro.categoria.equals(cat)){
                libro.getAutor().info();
                // Autor autor = libro.getAutor();
                // autor.info();
            }
        }
    }




    //sumar precios de libros de un Autor y ver si tiene
    //libros de programacion
    public static void librosPreAutor(int nif){
        //con libros en Autor (relacion inversa)
        int suma = 0;
        Autor autor = App.buscarAutor(nif);
        for (Libro libro: autor.getLibros()){
            suma = suma + libro.precio;
            if (libro.categoria == "Programacion"){
                libro.info();
            }
        }
    }
    public static void librosAutor(int nif){
        //con libros en Autor (relacion inversa)
        Autor autor = App.buscarAutor(nif);
        for (Libro libro: autor.getLibros()){
            libro.info();
        }
    }
    public static void librosAutor1(int nif){
        //sin libros en Autor (relacion inversa)
        for (Libro libro: App.LLibros){
            if (libro.getAutor().getAutorId() == nif){
                libro.info();
            }
        }
    }

    public static void insertarAutores(){
        int i=1;
        while (i<=2){
            Autor autor = new Autor(i);
            App.LAutores.add(autor);
            i++;
        }
    }
    //donde se establece la Fk --> fOREIGN KEY
    public static void insertarLibros(){
        int i=10;
        while (i<=11){
            Libro libro = new Libro(i); //PedirDatos()
            System.out.print("Autor del Libro: ");
            int nif = App.entrada.nextInt(); //PK DEL LIBRO
            //Buscar ese nif en la Lista de Autores y devolver el Autor
            Autor autor = App.buscarAutor(nif); //busca el Autor en la lista de Autores
            //findOne() --> BD
            libro.setAutor(autor); //1 libro --> 1 autor
            autor.setLibros(libro); //1autor --> M libros
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
