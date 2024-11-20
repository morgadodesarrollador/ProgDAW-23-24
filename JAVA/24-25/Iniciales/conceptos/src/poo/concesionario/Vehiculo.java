package poo.concesionario;

public class Vehiculo {
    public final int  DIAS = 7;
    String[] diasSemana = { "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"}; 
    double[] kmSemana = new double[7];
    private String marca;
    private String modelo;
    int velocidad;
    public double kmTotales = 0;

    //1-. Construnctor --> creacion
    public Vehiculo (String marca, String modelo, int velocidad){
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setVelocidad(velocidad);
    }

    //3-. Métodos funcionales --> comportamientos
    public double kmDia(int dia){
        // d = getindexSemane('Jueves');
        return this.kmSemana[dia];
    }
    public void generarKmSemana(){
        for (int i=0; i<DIAS; i++){
            double temp = Math.random()*200;
            this.kmSemana[i]=Math.round(temp*100.00)/100.00;
            this.kmTotales+=this.kmSemana[i];   
            //this.kmTotales=this.kmTotales + this.kmSemana[i];   
        }
    }

    //2-. métodos getters y setters (R/W) --> validacion/asignacion de datos
    public void setVelocidad(int vel){
        if (vel < 100){ //condiciones
            this.velocidad = 100;
            System.out.println("Error en Velocidad, asignando xDef velocidad minima");
        }else {
            this.velocidad = vel;
        }
        
    }
    public void setMarca(String marca){
        this.marca = marca.toUpperCase();
    }
    public void setModelo(String modelo){
        this.modelo = modelo.toUpperCase();
    }
    public int getVelocidad(){
        return this.velocidad;
    }
    public String getMarca(){
        return this.marca.toLowerCase();
    }
    public String getModelo(){
        return this.modelo.toLowerCase();
    }

    //4-. Impresión de datos
    //visualización de datos de la clase
    public void Info(){
        System.out.println("Vehiculo: " + this.getMarca() + " " + this.getModelo());
    }
    public String toString(){
        //devolver un string con toda la SALIDA FORMATEADA
        String info = "";
        info = " Vehiculo { \n" 
                 + "Marca: " + this.marca + " \n" 
                 + "Modelo: " + this.modelo + " \n"
                 + "Velocidad: " + this.velocidad + "Km/h \n"  ;
            
        String kmdias = "";
        for (int i=0; i<DIAS; i++){
            kmdias =  kmdias + diasSemana[i] + ": " + kmSemana[i] + "\n";
        }
        info = info.concat("Viajes: ").concat(kmdias).concat("}");

        return info;
    }




}
