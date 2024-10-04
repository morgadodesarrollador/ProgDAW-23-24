package basicos;

import java.util.Scanner;

public class Condicional {

    public int edad = 10; //variable --> propiedad
    private String nombre;
    protected String estado;
    private void Menu(){ // función --> método
        System.out.println("Calculo de Areas");
        System.out.println("----------------");
        System.out.println("1-. Cuadrado");
        System.out.println("2-. Rectángulo");
        System.out.println("3-. Triángulo");
        System.out.println("4-. Rombo");
        System.out.print("\n Elija una opción (1-4): ");
    }
    public void calcularAreas(){
        int opcion;
        String continuar = "S";
        double lado, base, altura;
        Scanner entrada = new Scanner(System.in);

        while (continuar == "S"){
            this.Menu();
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Introduzca el lado del cuadrado: ");
                    lado = entrada.nextDouble();
                    System.out.println("El A.Cuadrado = " + lado*lado + " m2");
                    break;
                case 2:
                    System.out.print("Introduzca base rectangulo: ");
                    base = entrada.nextDouble();
                    System.out.print("Introduzca altura rectangulo: ");
                    altura = entrada.nextDouble();
                    System.out.println("El A.Rectangulo = " + base*altura + " m2");
                    break;
                case 3:
                    System.out.print("Introduzca base triangulo: ");
                    base = entrada.nextDouble();
                    System.out.print("Introduzca altura triangulo: ");
                    altura = entrada.nextDouble();
                    System.out.println("El A.Triangulo = " + (base*altura)/2 + " m2");
                    break;
                default:
                    System.out.println("Opcion errónea ...");
            }
            System.out.print("\n Desea Continuar (S/N): ");
            continuar = entrada.next();
        }


    }
    public void imprimirMes(int nmes){ //1..12
        String mes="";

        switch (nmes){
            case 1:
                mes = "Enero";
                break;
            case 2:
                mes = "Febrero";
                break;
            case 3:
                mes = "Marzo";
                break;
            case 4:
                mes = "Abril";
                break;
            case 5:
                mes = "Mayo";
                break;
            //...
            case 12:
                mes = "Diciembre";
                break;
            default:
                mes = "No existe";
        }
        System.out.println("El mes " + nmes + " es " + mes);

    }
    public void tablaVerdad(boolean a, boolean b){

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("a AND b = " + (a && b));
        System.out.println("a OR b = " + (a || b));
        System.out.println("b = " + !b);


    }
    public String calcularNota(){
        String nombre;
        double nota;
        String calificacion = "";
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce tu nombre: ");
        nombre = entrada.next();
        System.out.print("Introduce la nota: ");
        nota = entrada.nextDouble();
        if (nota < 5) {
            calificacion = "Insuficiente";
        }else if ((nota >= 5) && (nota < 6 )){
            calificacion = "Suficiente";
        }else if ((nota >= 6) && (nota < 7)){
            calificacion = "Bien";
        }else if ((nota >= 7) && (nota < 9)){
            calificacion = "Notable";
        }else if ((nota >= 9) && (nota < 10)){
            calificacion = "Sobresaliente";
        }else if (nota == 10 )
            calificacion = "Matricula de Honor";
        else
            System.out.println("Err: Nota <= 10");

        if (nota == 5) {
            calificacion = "Insuficiente";
        }else if ((nota >= 5) && (nota <6 )){
            calificacion = "Suficiente";
        }else if ((nota >=6) && (nota <= 7))
            calificacion = "Bien";

        //...
        System.out.println(nombre + " tiene un " + calificacion + " con una nota de " + nota);
        return "";
    }

    public void entradaEdad() {
        String nombre;
        int edad;
        int numeros[] = new int[5];
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

        System.out.println(nombre + " estudia en " + this.estado(edad));

        for (int i = 1; i < 5; i++) {
            System.out.println("numero " + i);
            numeros[i] = entrada.nextInt();
        }
        for (int i = 1; i < 5; i++) {
            System.out.println("n " + i + " = "+numeros[i]);
        }
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
    public String estado (int edad){
        if (edad < 5)
            return "Infantil";
        else if ((edad >=5 ) && (edad<12))
            return "Primaria";
        else if ((edad >=12 ) && (edad<18))
            return "Secundaria";
        else if ((edad >=18 ) && (edad<25))
            return "Universidad";
        else
            return "Doctorado";
    }


}
