package intro;
import java.util.Scanner;

public class Bucles {
    public static Scanner entrada = new Scanner(System.in); 
  
    public static void main(String[] args) throws Exception {

          // Bucles.ejercicio1();
          // Bucles.ejercicio2();

          // Bucles.ejercio15();
        Bucles.ejercicio16();
        // Bucles.ejercicio16_1();
        
    }

    public static void ejercicio1(){
      //pedir el numero
      System.out.print("el multiplo: ");
      int multiplo = Bucles.entrada.nextInt();   
      for (int i=0; i<=100; i++){ //i+=5
        if (i % multiplo == 0 )
          System.out.print(i + ", ");
      }
    }

    public static void ejercicio2(){
      System.out.print("el multiplo: ");
      int multiplo = Bucles.entrada.nextInt(); 
      int i=0;  
      while (i<=100){
        if (i % multiplo == 0 )
          System.out.print(i + ", ");
        i++;
      } 
    }
   
    public static void clear(){
      System.out.println("");
      System.out.print("Desea continuar s/n: ");;
      char n = Bucles.entrada.next().toLowerCase().charAt(0);
      if (n == 's'){
        System.out.print("\033[H\033[2J");
        System.out.flush();
      }
    }
// --------------- Ejercicio 15 ---------------------------
    

    public static void ejercio15(){
      System.out.print("Base: ");
      int base = Bucles.entrada.nextInt();
      System.out.print("Exponente: ");
      int exponente = Bucles.entrada.nextInt();

      for (int i=1; i<=exponente; i++){ //2^1, 2^2, 2^3 ... 2^exp
        System.out.print(Bucles.potencia(base, i));
        System.out.print(", ");
      }
    }

    public static long potencia(int base, int exp){  //2^n
      long producto = 1;
      for (int i=1; i<=exp;  i++){
        producto = base * producto;
      }
      return producto;
    }

// --------------- Ejercicio 16 ---------------------------

  public static void ejercicio16(){
    System.out.print("hasta: ");
    int numero = Bucles.entrada.nextInt();
    for (int i=2; i<=numero; i++){
      if (esPrimo(i)){
        System.out.print(i + ", ");
      }
    }
  } 
  
  public static boolean esPrimo(int numero){
    // verificar que todos los restos de dividir numero 
    // entre los valores de (2...numero-1) es <> 0
    // verificar que TODOS LOS RESTOS son <> 0 --> para saber si es primo
    int i = 2;
    boolean primo = true; //variable bandera. --> SUPONGO QUE ES PRIMO
    while ( (i < numero) && primo ){ //todos los restos <> 0 --> es primo
    //  System.out.println(numero + " resto " + i + " = " + numero % i);
      if (numero % i == 0){ //si un un resto <> 0 --> que es primo  
        primo = false;
      }
      i++;
    }
    return primo;
  }



















    // public static void ejercicio161(){
    //   System.out.print("Numero: ");
    //   int numero = Bucles.entrada.nextInt();
    //   if (esPrimo(numero)){
    //     System.out.println(numero + " es primo");
    //   }else{
    //     System.out.println(numero + " no es primo");
    //   }
    // }

    // public static boolean esPrimo1(int numero){
    //   boolean primo = true;

    //   int i=2;
    //   while ((i<numero) && primo){
    //     if ((numero % i) == 0){
    //       primo = false;
    //     }else{
    //       i++;
    //     }
    //   }
    //   return primo;
    // }


// --------------- Ejercicio 16.1 ---------------------------

public static void ejercicio16_1(){
  System.out.print("Limite: ");
  int limite = Bucles.entrada.nextInt();
  System.out.print("Primos: ");
  for (int i=2; i<=limite; i++)
    if (esPrimo(i)){
      System.out.print(i + ", ");
  }
}
    
    
}

