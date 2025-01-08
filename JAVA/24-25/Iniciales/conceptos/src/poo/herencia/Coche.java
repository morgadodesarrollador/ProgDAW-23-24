package poo.herencia;

// new Vehiculo(4, 250, 180)
// new Coche (nR, vel, pot, nP)
public class Coche extends Vehiculo {
    private int nPuertas;

    //el constructor de la subclase (coche) llama, con super(), al
    //constructor de la superclase(vehiculo)
    Coche(String marca, String modelo, int ruedas, int velocidad, int potencia, int puertas){
        //el Constructor del padre
        super(marca, modelo, ruedas, velocidad, potencia);
        setnPuertas(puertas);
        // this.nPuertas = 3;
        this.setnPuertas(3);
    }

    public int getnPuertas(){
        return nPuertas;
    }
    public void setnPuertas(int p){
        this.nPuertas = p;
    }

    public String toString(){
        String info = super.toString();
        info = info + "\tNPuertas: " + this.getnPuertas()+ "\n";
        info = info + "\tKmTotales: " + this.getKmTotales() + "\n";
        return info ;
    }
    
}
