
import java.util.Scanner;

public class Lectura {
    //Lectura es una clase estática
    public static void main(String[] args) throws Exception {
        //en la var. cadena almacena la lectura por consola
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce tu nombre: ");
        String nombre = entrada.nextLine();
        System.out.print("Introduce tu edad: ");
        int edad = Integer.parseInt(entrada.nextLine());
        System.out.println("Te llamas " + nombre + " y tienes " + edad + " años");
        //llamar o invocar al método estático esMayor()
        //esMayor(edad);
        Lectura.esMayor(edad); 
        Lectura.getAnioNac(edad);
    }

    public static void esMayor(int edad){
        // método estático de clase Lectura para saber si es o no mayor de edad
        if (edad >= 18){
            System.out.println("Con la edad de " + edad + " años eres Mayor de edad" );
        }else {
            System.out.println("Con la edad de " + edad + " años eres Menor de edad" );
        }
    }

    public static void getAnioNac(int edad){
        int anio = 2024 - edad;
        System.out.println("Naciste en el año " + anio);
    }

    

    
}

