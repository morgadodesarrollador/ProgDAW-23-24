package intro;

import java.util.Scanner;

public class Persona {
    //propiedades a NIVEL DE CLASE SON ACCESIBLES A TODOS LOS MÉTODOS DE ESTA CLASE
    public static String nombre1;
    public static String nombre2;
    public static int edad1;
    public static int edad2;

    public static void main(String[] args){
        //en la var. cadena almacena la lectura por consola --> Flujo de datos
        //nombre1, nombre2, edad1, edad2 se declaran a NIVEL DE METODO
        //Al valor de estas SOLO SE AACEDE EN EL METODO main()
        Scanner entrada = new Scanner(System.in); //flujo de datos y sobre el leere todas las variables
        System.out.print("Nombre Persona1: ");
        Persona.nombre1 = entrada.nextLine();
        //nombre1 = entrada.nextLine();
        //String nombre1 = entrada.nextLine();
        System.out.print("Edad de " + nombre1 + ": ");
        Persona.edad1 = Integer.parseInt(entrada.nextLine());
        System.out.print("Nombre Persona2: ");
        Persona.nombre2 = entrada.nextLine();
        System.out.print("Edad de " + nombre2 + ": ");
        Persona.edad2 = Integer.parseInt(entrada.nextLine());
        Persona.quienMayor();
    }
    public static void quienMayor(){
        if (Persona.edad1 > Persona.edad2){
            System.out.println(Persona.nombre1 + " es mayor que " + Persona.nombre2);
        }else if (Persona.edad1 == Persona.edad2){
            System.out.println(Persona.nombre1 + " tiene la misma edad que " + Persona.nombre2);
        }else{ //e1 < e2
            System.out.println(Persona.nombre2 + " es mayor que " + Persona.nombre1);
        }
    }
    

    

    

    
} //cierra la clase

