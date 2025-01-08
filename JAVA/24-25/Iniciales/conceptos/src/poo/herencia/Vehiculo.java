package poo.herencia;

//no podemos hacer un new de Vehiculo pero sí de las 
//subclases: Coche, Moto, Camión
public abstract class Vehiculo {
    private String marca;
    private String modelo;
    private int nRuedas;
    private int velocidad;
    protected int potencia;
    private int kmTotales = 0;


    Vehiculo(String marca, String modelo, int nR, int vel, int pot){
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setPotencia(pot);
        this.setVelocidad(vel);
        this.setnRuedas(nR);
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