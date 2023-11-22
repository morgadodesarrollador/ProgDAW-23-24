package listas;
import java.util.ArrayList;
import java.util.Scanner;

public class Notas {
    Scanner entrada = new Scanner(System.in);
    ArrayList<Integer> notas = new ArrayList<Integer>();
    int numNotas=0;
    public Notas() {
        this.rellenar();
    }

    public void rellenar(){

        System.out.print("Numero de notas: ");
        this.numNotas = entrada.nextInt();
        for (int i = 0; i<this.numNotas; i++){
            this.notas.add((int)Math.floor(Math.random()*10+1));
        }
    }

    public int Max(){
        int max = this.notas.get(0);
        for (int nota: this.notas){ //foreach JS, PHP, PYTHON
            if (nota > max){
                max = nota;
            }
        }
        return max;
    }

    public void listar(){
        for (int i = 0; i<this.numNotas; i++){
            System.out.print(this.notas.get(i) + " - ");
        }
    }
}
