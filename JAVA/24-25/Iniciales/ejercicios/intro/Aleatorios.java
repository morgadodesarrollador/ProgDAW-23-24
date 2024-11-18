package intro;

import java.util.Scanner;

public class Aleatorios {
    public static Scanner entrada = new Scanner(System.in); 

    public static void main(String[] args) throws Exception {

        Aleatorios.ejercicio11();
      
  }

  public static void ejercicio11(){
    int suspensos = 0;
    int aprobados = 0;
    int bien = 0;
    int notables = 0;
    int sobresalientes = 0;
    int mhonor = 0;
    double nota = 0;
    for (int i=0; i<=20; i++){ 
        nota = Math.random()*10;
        nota = Math.round(nota*100.00)/100.00;
        System.out.print(nota + " ");
        if (nota < 5){
          suspensos++;
        }else if ( (nota >= 5) && (nota < 6)){
          aprobados++;
        }else if ((nota >= 6) && (nota < 7)){
          bien++;
        }else if ((nota >= 7) && (nota < 9)){
          notables++;
        }else if ((nota >= 9) && (nota < 10)){
          sobresalientes++;
        }else{
          mhonor++;
        }
    }
    System.out.println("");
    System.out.println("Suspensos: " + suspensos);
    System.out.println("Aprobados: " + aprobados);
    System.out.println("Bien: " + bien);
    System.out.println("Notables: " + notables);
    System.out.println("Sobresalientes: " + sobresalientes);
    System.out.println("M.Honor: " + mhonor);

  }
}
