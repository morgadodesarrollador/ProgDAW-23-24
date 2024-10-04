
import java.util.Scanner;
//NO SE IMPORTA LA CLASE Math

public class Figura {
    //definimos PI como una constante
    public static final double PI = 3.1416;
    //flujo de datos y sobre el leere todas las variables
    public static Scanner entrada = new Scanner(System.in); 
    public static double area; //declaro area
    
    public static void main(String[] args){
        
        // Figura.MenuIf();
        Figura.MenuSwitch();
        
    }
    public static void MenuSwitch(){
        int opcion;
        char respuesta;
        boolean continuar = true;
        while (continuar){
            Figura.pintarMenu();
            opcion = Figura.entrada.nextInt();
            switch (opcion) {
                case 1: 
                    Figura.area = Figura.AreaCuadrado(); //usando area
                    System.out.println("El area del cuadrado es = " + Figura.area + " m2" );
                    break;
                case 2: 
                    Figura.area = Figura.AreaRectangulo();
                    System.out.println("El area del rectangulo es es = " + Figura.area + " m2" );  
                    break;
                case 3:
                    Figura.area = Figura.AreaTriangulo();
                    System.out.println("El area del triángulo es es = " + Figura.area + " m2" );
                    break;
                case 4:
                    Figura.area = Figura.AreaCirculo();
                    System.out.println("El area del círculo es es = " + Figura.area + " m2" );
                    break;
                case 5:
                    //area prisma
                    break;
                default:
                    System.out.println("No hay más figuras ..." );
            } //switch
            System.out.print("¿ desea continuar S/N ? : ");
            respuesta = Figura.entrada.next().toUpperCase().charAt(0);
            if (respuesta == 'N')
                continuar = false;
        } //while
    } //MenuSwitch

    public static void MenuIf() {
        int opcion;
        char respuesta;
        boolean continuar = true; 
        while (continuar) { //Bucle whille (mientras) -> Se ejecuta mientras la CONDICION ES CIERTA
            Figura.pintarMenu();
            opcion = Figura.entrada.nextInt();
            //1 SOLO if .. else --> 2 valore v/f ---> Condicional simple
            //varios if ANIDADOS --> decido entre n VALORES --> Condicional Compuesto
            if (opcion == 1){ //instrucción CONDICIONAL
                Figura.area = Figura.AreaCuadrado(); //usando area
                System.out.println("El area del cuadrado es = " + Figura.area + " m2" );
            }else if (opcion == 2) {
                Figura.area = Figura.AreaRectangulo();
                System.out.println("El area del rectangulo es es = " + Figura.area + " m2" );        
            }else if (opcion == 3) {
                Figura.area = Figura.AreaTriangulo();
                System.out.println("El area del triángulo es es = " + Figura.area + " m2" );
            }else if (opcion == 4){
                Figura.area = Figura.AreaCirculo();
                System.out.println("El area del círculo es es = " + Figura.area + " m2" );
            }else {
                //hacer Area Prisma
            }
            System.out.print("¿ desea continuar S/N ? : ");
            respuesta = Figura.entrada.next().toUpperCase().charAt(0);
            //if ((respuesta == 'N') && (respuesta == 'n')) //or and
            if (respuesta == 'N')
                continuar = false;
    }


        
        
        
        
    }

    public static void pintarMenu(){
        System.out.println("Menú Principal");
        System.out.println("--------------");
        System.out.println("1-. Area del Cuadrado");
        System.out.println("2-. Area del Rectángulo");
        System.out.println("3-. Area del Triángulo");
        System.out.println("4-. Area del Circulo");
        System.out.println("5-. Area del Prisma Triangular");
        System.out.print("Elige una opción: ");
        
    }

    //void --> el método NO DEVUELVE NADA
    public static double AreaCuadrado(){
        //pedir por teclado el lado del cuadrado
        System.out.print("Lado del cuadrado: ");
        double lado = Figura.entrada.nextDouble();
        return lado * lado; 
    }

    public static double AreaRectangulo(){
        System.out.print("Lado1 del rectángulo: ");
        double lado1 = Figura.entrada.nextDouble(); 
        System.out.print("Lado1 del rectángulo: ");
        double lado2 = Figura.entrada.nextDouble(); 
        return lado1*lado2;
    }
    

    public static double AreaTriangulo(){
        System.out.print("Base del Triángulo: ");
        double base = Figura.entrada.nextDouble(); 
        System.out.print("Altura del Triángulo: ");
        double altura = Figura.entrada.nextDouble(); 
        return (base*altura)/2;
    }

    public static double AreaCirculo(){
        System.out.print("Radio del circulo: ");
        double radio = Figura.entrada.nextDouble(); 
        //return Figura.PI*radio*radio;
        //return Figura.PI * Math.pow(radio, 2);
        return Math.PI * Math.pow(radio, 2);
    }
    

    

    

    
} //cierra la clase

