
import org.json.*;
import java.util.ArrayList;
import java.util.Arrays;
import listas.Notas;

public class Main {
    public static void main(String[] args) {
        Notas notas = new Notas();
        notas.listar();
        System.out.print("Maximo = " + notas.Max());

    }
}
