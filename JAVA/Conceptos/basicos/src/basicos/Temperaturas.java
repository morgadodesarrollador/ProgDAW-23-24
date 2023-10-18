package basicos;

public class Temperaturas {

    public String[] diasSemana = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sabado", "Domingo"};
    public String[] meses = { "Enero" };
    public double[] valores; //declaro que valores es un array de decimales
    private double[] datosMax = new double[2];
    private double[] datosMin = new double[2];

    public int longitud;
    private double maximo;

    public Temperaturas(int longitud) {
        //this.diasSemana[0] = "Lunes";
        //this.diasSemana[1] = "Martes";
        //this.diasSemana[2] = "Miércoles";

        //ARRAYS ESTATICOS --> no pueden crecer en ejecución
        this.valores = new double[longitud]; //reservo 10 direcciones en RAM
        this.longitud = longitud;
        this.lectura();
        this.informe();
    }

    public double[] getMaximo(){
        return this.datosMax;
    }
    public void setMaximo()
    {
        this.maximo = this.valores[0];
        int pmaximo = 0;
        for (int i = 1; i < this.longitud; i++){
            if (this.valores[i] > this.maximo){
                this.maximo = this.valores[i];
                pmaximo = i;
            }
        }
        this.datosMax[0] = this.maximo;
        this.datosMax[1] = pmaximo;
    }

    public void lectura() { //sensor
        //leer longitud temperaturas
        System.out.println("----- LECTURA... --------");

        for (int i = 0; i< this.longitud; i++){
            this.valores[i] = Math.random()*50;
        }
    }
    public void informe(){
        //imprimir longitud temperaturas
        System.out.println("----- LECTURAS --------");
        //dias de la semana
        for (int i = 0; i< this.diasSemana.length; i++){
            if (i <= this.longitud - 2)
                System.out.print (this.diasSemana[i] + " - ");
            else
                System.out.print (this.diasSemana[i]);
        }
        System.out.println("");
        for (int i = 0; i<this.longitud; i++){
            System.out.println("t"+(i+1) +" = " + this.valores[i]);
        }
        //System.out.println("----- TOTALES --------");
        //this.setMaximo();

        //System.out.println("Maximo = " + this.getMaximo());
    }

}
