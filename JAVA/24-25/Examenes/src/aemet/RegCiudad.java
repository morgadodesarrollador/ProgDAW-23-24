package aemet;

public class RegCiudad {
    public  final int NDIAS = 7;
    public  final int NTEMP = 3;
    
    private String[] dias = { "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo" };

    private String nombre;
    private int vmax;
    private int vmin;
    int[][] temperaturas = new int[NDIAS][NTEMP];
    int[] datosDia = new int[NTEMP]; 
    int[] datosSemana = new int[NTEMP]; 
    

    public RegCiudad(String nombre){
        this.setNombre(nombre);
        this.setVmin(-1);
        this.setVmax(40);
        this.GenerarTemperaturas();
    }
    public RegCiudad(String nombre, int vmax, int vmin){
        this.setNombre(nombre);
        this.setVmin(vmax);
        this.setVmax(vmin);
        this.GenerarTemperaturas();
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
        for (int i=0; i<NDIAS; i++){
            for (int j=0; j<NTEMP; j++){
                int temperatura = (int) (Math.random() * (this.vmax - this.vmin + 1)) + this.vmin;
                this.temperaturas[i][j] = temperatura;
            }
        }
    }

    public int[] getDatosDia(String dia){
        //de una ciudad y un dia se recoge max, min y media de las 3 temp
        int IDia = this.getIndexDia(dia);
        int min = this.temperaturas[IDia][0];
        int max = this.temperaturas[IDia][0];
        int suma = 0;
        for (int j=0; j<NTEMP; j++){
            if (this.temperaturas[IDia][j] < min){
                min = this.temperaturas[IDia][j];
            }
            if (this.temperaturas[IDia][j] > max){
                max = this.temperaturas[IDia][j];
            }
            suma+=this.temperaturas[IDia][j];
        };
        this.datosDia[0] = max;
        this.datosDia[1] = min;
        this.datosDia[2] = (int) suma/this.NTEMP;
        return this.datosDia;
    }

    public int[] getDatosSemana(String dia){
        //max, min, media de la ciudad en la semana
        int max;
        int pmax = 0;
        int[] datos;
        int[] datosMax = new int[2];
        datos = this.getDatosDia("Lunes");
        max = datos[0];
        for (int i=0; i<NDIAS; i++){
            datos = this.getDatosDia(this.dias[i]);
            if (datos[i] > max){
                max = datos[i];
                pmax = i;
            }
        }
        datosMax[0] = pmax;
        datosMax[1] = max;
        return datosMax;
    }

    public int getIndexDia(String dia){
        int index = -1; // sup que no se encuentra
        for(int i=0; (i<NDIAS) && (index == -1); i++){ //ejecuto mientras no se encuentre
            if (this.dias[i]== dia){
                index = i;
            }
        }
        return index;
    }

    public void mostrarTabla(){
        String temp="";
        System.out.printf("%10s", this.nombre);
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
    public String toString(){
        String info = "";
        info = "\n" + this.nombre + '\n';
        String dias = "";
        String temp = "";
        
        for (int i=0; i<NDIAS; i++){
            temp = "";
            for (int j=0; j<NTEMP; j++){
                temp = temp + this.temperaturas[i][j] + ", ";
            }  
            dias = dias + "  " + this.dias[i] + ": " + temp + "\n";
        }
        // dias = temp + "\n";
        info = info + dias +"\n";
        return info;
    }
}
