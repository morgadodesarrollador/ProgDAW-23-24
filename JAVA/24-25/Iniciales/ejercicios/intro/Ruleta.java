package intro;

import java.util.Scanner;

public class Ruleta {
    public static Scanner entrada = new Scanner(System.in); 
    static int TIRADAS = 10;
    static int NPERSONAS = 5;
    static String[] personas = { "Ana", "Juan", "Jose", "Maria", "Noelia" };
    static double[] notas = new double[NPERSONAS];

    public static void main(String[] args){
        
        generarVector();
        imprimir();
        System.out.println();
        ordenar();
       
    }

    static void generarVector(){
        for (int i=0; i<NPERSONAS; i++){
            double temp = Math.random()*10;
            Ruleta.notas[i] = Math.round(temp*100.00)/100.00;
        }
    }
    static int getMax(int pos){
        double max = 0;
        int pmax = 0;
        for (int i=pos; i<NPERSONAS; i++){
            if (Ruleta.notas[i]>max){
                max = Ruleta.notas[i];
                pmax=i;
            }
        }
        return pmax;
    }

    static void ordenar(){
        for (int i=0; i<NPERSONAS; i++){
            //obtener la posMax desde i en adelante
            int pmax = getMax(i);
            //intercambiar i por pmax
            double temp = Ruleta.notas[i];
            Ruleta.notas[i] = Ruleta.notas[pmax];
            Ruleta.notas[pmax] = temp;
            //imprimir el vector
            imprimir();
            System.out.print(" " + i + " <---> " + pmax  );
            System.out.println();
        }
    }
    static void imprimir(){
        for (int i=0; i<NPERSONAS; i++){
            System.out.print(Ruleta.notas[i] + " ");
        }
    }

}

