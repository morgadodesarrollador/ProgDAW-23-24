package poo.herencia;
import java.util.Scanner;

// new Vehiculo(4, 250, 180)
// new Coche (nR, vel, pot, nP)
public class Coche extends Vehiculo {
    private int nPuertas;

    Coche(){
        super.pedirDatos();
        this.pedirDatos();
    }
    //el constructor de la subclase (coche) llama, con super(), al
    //constructor de la superclase(vehiculo)
    Coche(String marca, String modelo, int ruedas, int velocidad, int potencia, int puertas){
        //el Constructor del padre
        super(marca, modelo, ruedas, velocidad, potencia);
        setnPuertas(puertas);
    }
    @Override
    public void pedirDatos(){
        System.out.print("Puertas: ");
        int puertas = entrada.nextInt();
        this.setnPuertas(puertas);
    }

    public int getnPuertas(){
        return nPuertas;
    }
    public void setnPuertas(int p){
        this.nPuertas = p;
    }
    //redefinir los getKmTotales del padre
    @Override
    public int getKmTotales() {
        return 10 + super.getKmTotales();
    }

    public String toString(){
        String info = super.toString();
        info = info + "\tNPuertas: " + this.getnPuertas()+ "\n";
        info = info + "\tKmTotales: " + this.getKmTotales() + "\n";
        return info ;
    }
    
}