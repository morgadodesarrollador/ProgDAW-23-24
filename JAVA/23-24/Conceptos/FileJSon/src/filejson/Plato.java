package filejson;
import java.util.Scanner;

public class Plato {
    public String nombre;
    public int precio;
    public int duracion;
    public String tamaño;

    public Plato(String nombre, int duracion, String tamaño, int precio){
        this.nombre = nombre;
        this.duracion = duracion;
//        this.precio = Integer.parseInt(precio);
        this.precio = precio;
        this.tamaño = tamaño;
    }

    public String toString() {
        String Cadena =
                "-----------------------------------------------\n" +
                "Nombre Plato:\t " +  this.nombre + "\n" +
                "Precio:\t" + this.precio + "\n" +
                "Duracion: \t" + this.precio + "\n" +
                "Difultad:\t" + this.tamaño + "\n" +
                "-----------------------------------------------\n";
        return Cadena;
    }
}
