package basicos;

public class Temperaturas {
    public double[] valores; //declaro que valores es un array de decimales
    public int longitud;
    public Temperaturas(int longitud) {
        //ARRAYS ESTATICOS --> no pueden crecer en ejecución
        this.valores = new double[longitud]; //reservo 10 direcciones en RAM
        this.longitud = longitud;
        this.lectura();
        this.informe();
    }
    public void lectura() {
        //leer longitud temperaturas
        System.out.println("----- LECTURA... --------");

        for (int i = 0; i<this.longitud; i++){
            this.valores[i] = Math.random()*50;
        }
    }
    public void informe(){
        //imprimir longitud temperaturas
        System.out.println("----- INFORME --------");
        for (int i = 0; i<this.longitud; i++){
            System.out.println("t"+(i+1) +" = " + this.valores[i]);
        }
    }
}
