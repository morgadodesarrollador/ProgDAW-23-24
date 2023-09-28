import java.io.Console;
import individuo.*;
import vehiculo.*;
public class App {
    public static void main(String[] args) throws Exception {
        Persona pAna = new Persona("Ana", "Almeria", 1960);
        System.out.println("Nombre: " + pAna.nombre);
        System.out.println("Ciudad: " + pAna.ciudad);
        System.out.println("Edad: " + pAna.obtenerEdad(2023) + " años");
        System.out.println("-------------------------");
        Persona pAntonio = new Persona("Antonio", "Murcia", 1980);
        System.out.println("Nombre: " + pAntonio.nombre);
        System.out.println("Ciudad: " + pAntonio.ciudad);
        System.out.println("Edad: " + pAntonio.obtenerEdad(2023) + " años");
        System.out.println("---------------------");

        Vehiculo coche = new Vehiculo("7896HLK", 67, 90, 4);
        System.out.println(("Velocidad: " + coche.getVelocidad()));
        coche.setVelocidad(150);
        System.out.println("Matricula: " + coche.matricula);
        System.out.println(("Velocidad: " + coche.getVelocidad()));
        System.out.println(("Ruedad: " + coche.getNruedas()));
        System.out.println(("Potencia: " + coche.potencia));

    }
}
