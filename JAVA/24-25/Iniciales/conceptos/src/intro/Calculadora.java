package intro;

import java.util.Scanner;

public class Calculadora {
    public static Scanner entrada = new Scanner(System.in); 
  
    public static void main(String[] args) throws Exception {

        // Calculadora.pruebas1();
        // Calculadora.aleatorios();
    //    Calculadora.maxminNotas();
       Calculadora.maxminTemperaturas(); 
    }
    public static void maxminTemperaturas(){
        double temp = 0;
        double maximo = 0; //sup que es un 0
        double minimo = 0; //sup ques 10
        for (int i=0; i<10; i++){
            temp = Math.random()*10;
            temp = Math.round(temp*100.00)/100.00;
            System.out.print(temp + " - ");
            if (i == 0 ){ //YA NO HAY INCERTIDUMBRE EN LA SUPOSICION
                maximo = temp;
                minimo = temp;
            }else {
                if (temp > maximo){
                    maximo = temp;
                }
                if (temp < minimo){
                    minimo = temp;
                }
            }
        }
        System.out.println();
        System.out.println("Temp máxima = " + maximo);
        System.out.println("Temp minima = " + minimo);
        
    }
    public static void maxminNotas(){
        double nota = 0;    //SUPOSICIONES
        double maximo = 0; //sup que es un 0
        double minimo = 10; //sup ques 10
        for (int i=0; i<10; i++){
            nota = Math.random()*10;
            nota = Math.round(nota*100.00)/100.00;
            System.out.print(nota + " - ");
            if (nota > maximo){
                maximo = nota;
            }
            if (nota < minimo){
                minimo = nota;
            }
        }
        System.out.println();
        System.out.println("Nota máxima = " + maximo);
        System.out.println("Nota minima = " + minimo);
    }
    public static void aleatorios(){
        double numero = 0;
        for (int i=0; i<5; i++){
            //numeros entre 0 y 6
            //numero = Math.random()*6 + 1; // 1 y 6
            // numero = Math.random()*7; /CLEARCLE/ 0 y 6
            // -------- 30 y 90
            // numero = Math.random()*60 + 1;// entre 1 y 60.999
            // System.out.print((int)numero + 30); //1...60 + 30 --> 60 .. 90
            // System.out.println();
            // -------- 60 Y 90
            // numero = Math.random()*30 + 1;// entre 1 y 60.999
            // System.out.print((int)numero + 60); //1...60 + 30 --> 60 .. 90
            // System.out.println();
            double nota = Math.random()*10;
            nota = Math.round(nota*100.00)/100.00;
            // Math.round(nota*10.0)/10.0 --> 5.6
            // Math.round(nota*100.00)/100.00 --> 5.57
            // nota = (Math.round(Math.random()*10)*100.00)/100.00;
            // System.out.println("nota = " + Math.round(nota*100.00)/100.00);
            System.out.println(nota);

            
        }
       
    
    }


    public static void pruebas1(){
        //Metodos trigonometricos --> Math
        double valor = Math.sin(90);
        // System.out.println(valor);
        // System.out.println(Math.toDegrees(valor));
        // System.out.println(Math.sqrt(4));
        // System.out.println(Math.pow(3, 2));
        // System.out.println(Math.abs(-10));
        // System.out.println(Math.round(10.63));
        // System.out.println(Math.round(10.48));
        // System.out.println(Math.round(10.57));

        System.out.println(Math.max(23, 45));
                

    }

  
}

