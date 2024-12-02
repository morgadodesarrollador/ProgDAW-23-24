package biblioteca;
import java.util.ArrayList;

import biblioteca.Autor;
/**
 * Hello world!
 */
public final class App {
    //1Biblioteca tiene Muchos Autores
    public static ArrayList<Autor> LAutores = new ArrayList<>();
    
    private App() {
    }
    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        App.insertarAutores();
        App.mostrarAutores();
        
    }
    public static void insertarAutores(){
        int i=1;
        while (i<=2){
            Autor autor = new Autor(i);
            App.LAutores.add(autor);
            i++;
        }
    }

    public static void mostrarAutores(){
        for (Autor autor: App.LAutores){
            autor.info();
        }
    }
}
