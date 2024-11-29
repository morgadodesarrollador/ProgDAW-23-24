package biblioteca;
import Autor;
/**
 * Hello world!
 */
public final class App {
    private App() {
        Autor autor1 = new Autor("1", "Maria", "Perez", "maria@gmail.com");
    }



    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
