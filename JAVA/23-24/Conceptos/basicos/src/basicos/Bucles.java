package basicos;

public class Bucles {


    public void sumarAleatorios(int n, int limite){
        int valor = 0;
        double nota = 0.0;
        int suma = 0;
        double media = 0.0;
        int max = 0;
        int min = 100;
        for (int i = 1; i <= n; i++){
            valor = (int)Math.round(Math.random()*limite);
            suma+=valor; // suma = suma + valor;
            if(valor > max){
                max = valor;
            }
            if (valor < min){
                min = valor;
            }
            System.out.println(valor);
        }
        System.out.println(valor);
        media = suma / n;
        System.out.println("Suma = " + suma);
        System.out.println("Promedio = " + media);
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
    }
    public void sumar(int n){
        int suma = 0;
        for (int i=1; i <= n; i++){
          //suma= suma + i;
            suma+=i;
        }

        System.out.println("la suma de los " + n + " primeros numeros es " + suma);
    }

    //Imprimir los 10 primeros números por pantalla
    //DECLARACIÓN del método IMPRIMIR (no se ejecuta)
    public void imprimir(int n, String nombre, double edad){ //variable --> parámetro del método
        int suma = 0; //variable local del método
        int i;
        for (i=1; i <= n; i++ ){
            int h = 3;
            System.out.println("i = " + i);
           // suma = suma + i; //acumulador
        }
        System.out.println("valor i del for = " + i);
        System.out.println("La suma de los 100 primeros nos es " + suma);

    }









    public int[] elementos;



   // public Bucles (int limite){
   //     this.elementos = new int[limite];
   // }
    public void  sumaN (int limite){
        int suma = 0;
        for (int i = 1; i <= limite; i++){
            suma = suma + i;
            elementos[i] = suma;
           // System.out.println(Math.random() * 10);
        }
        System.out.println("La suma de los " + limite + " primeros numeros =  " + suma);
        this.imprimirN(limite);
    }

    public void imprimirN(int limite){
        int i = 0;

        while (i<=limite){
            System.out.println("S"+i + " =" + this.elementos[i]);
            i++;
        }
    }
}
