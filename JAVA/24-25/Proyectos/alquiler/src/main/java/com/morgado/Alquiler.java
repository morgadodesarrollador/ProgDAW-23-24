package com.morgado;
import com.morgado.*;

/**
 * Hello world!
 */
public final class Alquiler {
    private Alquiler() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo();
        vehiculo.mostrarDatos();
        // vehiculo.TotalDia(3);
        vehiculo.informe();
    }
}
