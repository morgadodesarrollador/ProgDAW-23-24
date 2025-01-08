package poo.herencia;
import java.util.Scanner;

//no podemos hacer un new de Vehiculo pero sí de las 
//subclases: Coche, Moto, Camión
public abstract class Vehiculo {
    private String marca;
    private String modelo;
    private int nRuedas;
    private int velocidad;
    protected int potencia;
    private int kmTotales = 0;
    public Scanner entrada = new Scanner(System.in); 

    Vehiculo(){
        // this.pedirDatos();
    }
    Vehiculo(String marca, String modelo, int nR, int vel, int pot){
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setPotencia(pot);
        this.setVelocidad(vel);
        this.setnRuedas(nR);
    }
    
    public void pedirDatos(){
        System.out.print("Marca: ");
        String marca = entrada.nextLine();
        this.setMarca(marca);
        System.out.print("Modelo: ");
        String modelo = entrada.nextLine();
        this.setModelo(modelo);
        System.out.print("Potencia: ");
        int potencia = entrada.nextInt();
        this.setPotencia(potencia);
        System.out.print("Velocidad: ");
        int velocidad = entrada.nextInt();
        this.setVelocidad(velocidad);
        System.out.print("Ruedas: ");
        int ruedas = entrada.nextInt();
        this.setnRuedas(ruedas);
    }

    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public int getnRuedas(){
        return nRuedas;
    }

    public void setnRuedas( int ruedas){ 
        nRuedas = ruedas;
    }

    public int getVelocidad(){
        return velocidad;
    }

    public void setVelocidad(int vel){
        velocidad = vel;
    }

    public int getPotencia(){
        return potencia;
    }

    public void  setPotencia(int pot){
        potencia = pot;
    }

    public void recorre(int km){
        kmTotales = kmTotales + km;
    }

    public int getKmTotales(){
        return this.kmTotales;
    }

    public String toString(){
        String info ="";
        info = info + this.getMarca() + "/" + this.getModelo()+"\n";
        info = info + "-------------------------------\n";
        info = info + "\tRuedas: " + getnRuedas() + "\n";
        info = info + "\tVelocidad: " + getVelocidad() + " m/s \n";
        info = info + "\tPotencia: " + getPotencia() + " kw \n";
        return info;        
    }

}