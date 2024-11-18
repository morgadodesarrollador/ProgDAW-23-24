package intro;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class CineCampa26 {
    public static int precioBase;
    public static String diaSemana;
    public static int numEntradas;
    public static char tarjetaCampa;
    public static double precioTotal;
    public static double precioGrupo;
    public static double precioDto;

    public static final int precioPareja = 11;
    public static Scanner entrada = new Scanner(System.in); 

    public static int nParejas;
    public static int individuales;
    public static void main(String[] args){
        
        // se dedica a ORQUESTAR --> CONTROLAR
        CineCampa26.entradaDatos();
        CineCampa26.calcularPreciototal();;
        CineCampa26.ImprimirTicket();
    }
    public static void entradaDatos(){
        System.out.println("Venta de Entradas CineCampa");
        System.out.println("----------------------------------");
        System.out.print("Numero de Entradas: ");
        CineCampa26.numEntradas = CineCampa26.entrada.nextInt();
        System.out.print("Dia de la semana: ");
        CineCampa26.diaSemana = CineCampa26.entrada.next().toLowerCase();
        System.out.print("¿ Tiene tarjeta Campa ? (s/n): ");
        CineCampa26.tarjetaCampa = CineCampa26.entrada.next().toLowerCase().charAt(0);
    }

    public static void calcularPreciototal(){
    
        CineCampa26.calcularPrecioBase();
        CineCampa26.precioTotal = CineCampa26.calcularPrecioGrupo() - CineCampa26.calcularDtoTarjeta();
    }

    public static void calcularPrecioBase(){
        
        CineCampa26.precioBase = 8;
        if (CineCampa26.diaSemana.equals("miercoles")){
            CineCampa26.precioBase = 5;
        }
    }

    public static int calcularPrecioGrupo(){
        int precioGrupo = 0;
        int precioParejas = 0;
        int precioIndicidual = 0;
        if (CineCampa26.diaSemana.equals("jueves")){
            CineCampa26.nParejas = CineCampa26.numEntradas/2;
            CineCampa26.individuales = CineCampa26.numEntradas%2;
            precioParejas =  CineCampa26.nParejas * CineCampa26.precioPareja;
        }else{
            CineCampa26.nParejas = 0;
            CineCampa26.individuales = CineCampa26.numEntradas;
        }
        precioIndicidual = CineCampa26.individuales * CineCampa26.precioBase;
        precioGrupo =  precioParejas + precioIndicidual;
        CineCampa26.precioGrupo = precioGrupo; //fijamos la propiedad
        return precioGrupo; // devolvemos valor
    }

    public static double calcularDtoTarjeta(){
        double dto = 0;
        if (CineCampa26.tarjetaCampa == 's'){
            dto =  (double) (CineCampa26.calcularPrecioGrupo() * 0.10);
            System.out.println("Dto = " + dto);
        }
        CineCampa26.precioDto = dto;
        return dto;
    }

    public static void ImprimirTicket(){
        System.out.println("-----------------------------------------");
        System.out.println("Aqui titne sus entradas. Gracias por su compra");
        
        if (CineCampa26.diaSemana.equals("jueves") && CineCampa26.nParejas >= 1){
            System.out.println("Entrada de Parejas: " + CineCampa26.nParejas);
            System.out.println("Precio por entrada de pareja " + CineCampa26.precioPareja );
            if (CineCampa26.individuales >= 1){
                System.out.println("Entradas Individuales: " + CineCampa26.individuales);
                System.out.println("Precio por entrada individual " + CineCampa26.precioBase );    
            }
        }else{
            System.out.println("Entradas Individuales: " + CineCampa26.individuales);
            System.out.println("Precio por entrada individual " + CineCampa26.precioBase );
        }
        System.out.println("Total: " + CineCampa26.precioGrupo);
        System.out.println("Descuento " + CineCampa26.precioDto);
        System.out.println("A pagar " + CineCampa26.precioTotal);
    }
}
