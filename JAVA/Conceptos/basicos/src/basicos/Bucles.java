package basicos;

public class Bucles {


    public int[] elementos;

    public Bucles (int limite){
        this.elementos = new int[limite];
    }
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
