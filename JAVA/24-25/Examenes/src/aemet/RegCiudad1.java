package aemet;
import java.util.ArrayList;

public class RegCiudad1 {
    public  final int NDIAS = 7;
    public  final int NTEMP = 3;
    
    private ArrayList<String> dias = new ArrayList<>(); //1D

    private String nombre;
    private int vmax;
    private int vmin;
    int[][] temperaturas1 = new int[NDIAS][NTEMP];
    //arrayList 2D
    ArrayList<ArrayList<Integer>> temperaturas = new ArrayList<>();
    

    public RegCiudad1(String nombre){
        this.setNombre(nombre);
        this.setVmin(-1);
        this.setVmax(40);
        this.setDias();
        this.GenerarTemperaturas();
        this.mostrarTemperaturas();
    }
    

    public void setDias(){
        this.dias.add("Lunes"); this.dias.add("Martes"); this.dias.add("Miercoles"); this.dias.add("Jueves"); 
        this.dias.add("Viernes"); this.dias.add("Sabado"); this.dias.add("Domingo"); 
    }
   
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setVmax (int vmax){
        this.vmax = vmax;
    }
    public void setVmin (int vmin){
        this.vmin = vmin;
    }

    public void GenerarTemperaturas(){
        //las 3 temperaturas de 1 DIA
        // ArrayList<Integer> tempDia = new ArrayList<>();
        // for (int i=0; i<NTEMP; i++){
        //     tempDia.add(0);
        // }
        for (String nombre: this.dias){
            // lunes(0), martes(1) ...
            //1fila
            ArrayList<Integer> tempDia = new ArrayList<>();
            for (int i=0; i<3; i++){
                tempDia.add(0);
            }
            for (int j=0; j<tempDia.size(); j++ ){ //3 temperaturas por dia
                int temperatura = (int) (Math.random() * (this.vmax - this.vmin + 1)) + this.vmin;
                tempDia.set(j, temperatura);
                // tempDia.add(temperatura);   
            }
            // tengo en el array "tempdia" las 3 temperaturas del dia 
            this.temperaturas.add(tempDia);
        }
    }
    public void mostrarTemperaturas() {
        
        ArrayList<Integer> tempDia = new ArrayList<>();

        for (int i=0; i<this.temperaturas.size(); i++){
            System.out.print(this.dias.get(i) + ": ");
            //System.out.print(this.temperaturas.get(i));
            tempDia = this.temperaturas.get(i);
            System.out.println("Direccion array tempdia (hashCaode): " + Integer.toHexString(System.identityHashCode(tempDia)));
            for (int temp: tempDia ){
                System.out.print(temp + "[" +  Integer.toHexString(System.identityHashCode(temp)) + "], ");
            }
            System.out.println();
        }
        //    
        //    }
    }
 
}
