package vehiculo;
import individuo.Persona;
public class Vehiculo {
    public String matricula;
    private int nruedas;
    public int potencia;
    private int velocidad;
    public Persona propietario;



    public Vehiculo (String matricula, int vel, int pot, int nr ){
        this.matricula = matricula;
        this.potencia = pot;
        this.setNruedas(nr);
        this.setVelocidad(vel);
    }

    public void setNruedas(int nRuedas) {
        this.nruedas = nRuedas;
    }
    public int getNruedas(){
        return this.nruedas;
    }

    public void setVelocidad(int vel){
        if ((vel >= 100) && (vel <= 200)){
            this.velocidad = vel;
        }else{
            System.err.println("Err: Velocidad > 100 y < 200");
        }

    }

    public String getVelocidad() {
        return this.velocidad + " Km/h";
    }



}
