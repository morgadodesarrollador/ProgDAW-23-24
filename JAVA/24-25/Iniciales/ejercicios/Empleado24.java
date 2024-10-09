import java.util.Scanner;
import java.text.DecimalFormat;

public class Empleado24 {
    
    public static final int horaExtra = 30;
    public static Scanner entrada = new Scanner(System.in); 

    public static String nombre;
    public static char estadoCivil;
    public static int cargo;
    public static int diasVisita;
    public static double salarioNeto; //SNeto = SBr - SRetencion
    
    //pq se necesitan en el cálculo y en la visualización
    public static int salarioBase;
    public static double irpf; //0.25 o 0.20
    public static int salarioBruto; // SBr = SB + DDietas 
    public static int dietas; //SDietas --> ndias * 30€
    public static double retencion; //SRetencion = SBr * irpf

    public static void main(String[] args){
        // se dedica a ORQUESTAR --> CONTROLAR
        Empleado24.entradaDatos();
        Empleado24.calcularSalario();
        Empleado24.MostrarDatos();

    }

    public static void entradaDatos() {
       
        System.out.print("Nombre: " );
        Empleado24.nombre = Empleado24.entrada.next();
        System.out.println("----- Cargo -----" );
        System.out.println("1- Programador Junior" );
        System.out.println("2- Programador Senior" );
        System.out.println("3- Jefe de Proyecto" );
        System.out.print("Introduzca el cargo del empleado (1 - 3): ");
        Empleado24.cargo = Empleado24.entrada.nextInt();
        System.out.print("¿ Cuántos dias ha estado de viaje visitando clientes ? ");
        Empleado24.diasVisita = Empleado24.entrada.nextInt();
        System.out.print("Introduzca su estado civil (S- Soltero, C- Casado): ");
        Empleado24.estadoCivil = Empleado24.entrada.next().toUpperCase().charAt(0);
    }

    public static void calcularSalario(){
        
        // int salarioBase;
        // int salarioBruto;
        // double irpf;
        // double retencion;

        int dietas;
        //fijar salario base
        switch (Empleado24.cargo){
            case 1: 
                Empleado24.salarioBase = 950;
                break;
            case 2: 
                Empleado24.salarioBase = 1200;
                break;
            case 3: 
                Empleado24.salarioBase = 1600;
                break;
        }

        //fijar irpf
        switch (Empleado24.estadoCivil){
            case 'S':
                Empleado24.irpf = 0.25;
                break;
            case 'C':
                Empleado24.irpf = 0.2;
                break;
        }

        Empleado24.dietas = Empleado24.diasVisita * Empleado24.horaExtra;
        Empleado24.salarioBruto = Empleado24.salarioBase + Empleado24.dietas;
        Empleado24.retencion = Empleado24.salarioBruto * Empleado24.irpf;
        Empleado24.salarioNeto = Empleado24.salarioBruto - Empleado24.retencion;
    }

    public static void MostrarDatos(){
        System.out.println("------------------------");
        System.out.printf("Salario Base %12d€\n", Empleado24.salarioBase);
        System.out.printf("Dietas (%d viajes ) %2d€\n", Empleado24.diasVisita, Empleado24.dietas);
        System.out.println("------------------------");
        System.out.printf("Salario Bruto %12d€\n", Empleado24.salarioBruto);
        System.out.printf("Retencion IRPF (%f ) %2f€\n", Empleado24.irpf*100, Empleado24.retencion);
    }


}