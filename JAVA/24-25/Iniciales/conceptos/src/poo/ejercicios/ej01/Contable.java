package poo.ejercicios.ej01;


public class Contable extends Empleado {
    private int plusSalario;

    Contable (String dni, String nombre){
        super(dni, nombre);
        this.setPlusSalario();
    }

    Contable (String dni, String nombre, String email, int hExtras){
        super(dni, nombre, email, hExtras);
        this.setPlusSalario();

    }

    public int getPlusSalario(){
        return this.plusSalario;
    }

    public void setPlusSalario(){
        this.plusSalario = 200;
    }

    public Double calcularSueldo(){
        return super.calcularSueldo() + this.getPlusSalario();
    }

    public void contabilizar(){
        System.out.println("Estoy Contabilizando ...");
    }

    @Override
    public String toString(){
        String info = super.toString();
        return info;
    }

}
