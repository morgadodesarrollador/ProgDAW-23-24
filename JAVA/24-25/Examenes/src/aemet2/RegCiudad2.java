package aemet2;

public class RegCiudad2 {
    public  final int NDIAS = 7;
    public  final int NTEMP = 3;
    
    private String[] dias = { "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo" };
    private int[][] temperaturas = new int[NDIAS][NTEMP];

    private String nombre;
    private int Vmax;
    private int Vmin;

    public RegCiudad2(String nombre){
        //(Granada) ---> por defecto vmin=-1 y vmax=40
        this.setNombre(nombre);
        this.setVmax(40);
        this.setVmin(-1);
        this.GenerarTemperaturas();
    }
    public RegCiudad2(String nombre, int vmin, int vmax){
        //Nomnre de ciudad y valores vmax/vmin entre los que socilan las tempaeraturas
        //(Almeria, 20, 40)
        this.setNombre(nombre);
        this.setVmax(vmax);
        this.setVmin(vmin);
        this.GenerarTemperaturas();
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setVmax (int vmax){
        this.Vmax = vmax;
    }
    public void setVmin (int vmin){
        this.Vmin = vmin;
    }

    public String getNombre(){
        return this.nombre;
    }
    public int getVmax(){
        return this.Vmax;
    }
    public int getVmin(){
        return this.Vmin;
    }
    
    public void GenerarTemperaturas(){
        for (int i=0; i<NDIAS; i++){
            for (int j=0; j<NTEMP; j++){
                int temperatura = (int) (Math.random() * (this.Vmax - this.Vmin + 1)) + this.Vmin;
                this.temperaturas[i][j] = temperatura;
            }
        }
    }

    public void mostrarTabla(){
        String temp="";
        System.out.printf("%10s", this.getNombre());
        for (int i=0; i<7; i++){
            System.out.printf("%15s", this.dias[i]+"   ");
        }
        System.out.println();
        System.out.printf("%10s", "");

        for (int i=0; i<NDIAS; i++){
            temp ="";
            for (int j=0; j<NTEMP; j++){
                temp = temp + this.temperaturas[i][j]+ ", ";
            }
            System.out.printf("%15s", temp);
        }
        System.out.println();

    }



}
