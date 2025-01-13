package poo.ejercicios.ej01;

public class Director extends Empleado{
    private int plusSalario;
    int numDespacho;
    Director (String dni, String nombre, int nDes){
        super(dni, nombre);
        this.setNumDespacho(nDes);
        this.setPlusSalario();
    }
    Director (String dni, String nombre, String email, 
              int nHExtra,  int nDes){
        super(dni, nombre, email, nHExtra);
        this.setNumDespacho(nDes);
        this.setPrecioHoraExtra(20);
        this.setPlusSalario();

        // this.precioHoraExtra = 20;
    }

    public int getNumDespacho(){
        return this.numDespacho;
    }

    public void setNumDespacho(int nDespacho){
        this.numDespacho = nDespacho;
    }
    public int getPlusSalario(){
        return this.plusSalario;
    }

    public void setPlusSalario(){
        this.plusSalario = 400;
    }

    public void analizar(){
        System.out.println("Estoy Analizando ...");
    }

    public Double calcularSueldo(){
        return super.calcularSueldo() + this.getPlusSalario();
    }

    public String toString(){
        String info = super.toString();
        info = info + "Despacho: " + this.getNumDespacho() + "\n";
        return info;
    }

}
