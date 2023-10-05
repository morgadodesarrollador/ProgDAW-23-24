package basicos;

import java.util.Scanner;

public class Condicional {
    public void entradaEdad(){
        String nombre;
        int edad;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce tu nombre: ");
        nombre = entrada.next();
        System.out.print("Introduce tu edad: ");
        edad = entrada.nextInt();

        //  edad  = Integer.parseInt(System.console().readLine());
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);

        if (this.mayorEdad(edad))
            System.out.println(nombre + " es mayor de edad");
        else
            System.out.println(nombre + " es menor de edad");
    }
    public boolean mayorEdad(int edad){
        if (edad >= 18) {
            //....bloque es un conjunto de instrucciones separadas por ;
            edad = edad + 10;
            return true;
        }else {
            return false;
        }
    }
}
