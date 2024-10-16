package bucles;
import java.util.Scanner;

public class Prueba1 {
    public static Scanner entrada = new Scanner(System.in); 
  
    public static void main(String[] args) throws Exception {

        System.out.println("Ejercicios de Bucles");
        System.out.println("------------------------------");
        // Prueba1.mostrar10();
        // Prueba1.clear();
        // Prueba1.mostrarN();
        // Prueba1.clear();
      
        System.out.print("Introduce el valor de n: ");
        int n = Prueba1.entrada.nextInt();
        System.out.println("La suma es: "+ Prueba1.sumarN(n));
        System.out.println("El factorial es: "+ Prueba1.factorialN(n));
        
        
    }

    public static void clear(){
      System.out.println("");
      System.out.print("Desea continuar s/n: ");;
      char n = Prueba1.entrada.next().toLowerCase().charAt(0);
      if (n == 's'){
        System.out.print("\033[H\033[2J");
        System.out.flush();
      }
    }

    public static void mostrar10 (){
      //Mostrar los 10 primeros números
      for (int i=1; i<11; i++){
        System.out.println("i = " + i);
      }
    }

    public static void mostrarN(){
      //mostrar los N primeros números
      System.out.print("Introduce el valor de n: ");
      int n = Prueba1.entrada.nextInt();
      for (int i=1; i<=n; i++){
        System.out.print(i + " - ");
      }
    }

    public static int sumarN(int n){
      int suma = 0;
      for (int i=1; i<=n; i++){
        suma = suma + i;
      }
      return suma;
    }

    public static double factorialN(int n){
      int factorial = 1;
      for (int i=1; i<=n; i++){
        factorial = factorial * i;
      }
      return factorial;
    }





    
    
}

