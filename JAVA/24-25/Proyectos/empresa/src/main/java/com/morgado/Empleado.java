package com.morgado;
import com.morgado.*;

public class Empleado {
    protected String tipo; 
    private String DNI;
    private String nombre;
    private String email;
    private Double salarioBase;
    private int horasExtra;
    protected int precioHoraExtra; 
    
    Empleado(String dni, String nombre){
        this.setDni(dni);
        this.setNombre(nombre);
    }
    Empleado(String dni, String nombre, String email, int hExtras){
        this.setDni(dni);
        this.setNombre(nombre);
        this.setEmail(email);
        this.setPrecioHoraExtra(10);
        this.setSalarioBase();
        this.setHorasExtra(hExtras);
        this.tipo = "Empleado";
    }

    public String getDni(){
        return this.DNI;
    }
    public void setDni(String dni){
        this.DNI = dni;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public Double getSalarioBase(){
        return this.salarioBase;
    }
    public void setSalarioBase(){
        this.salarioBase = 1000.0;
    }

    public int getHorasExtra(){
        return this.horasExtra;
    }

    public void setHorasExtra(int hExtra){
        this.horasExtra = hExtra;
    }
    public int getPrecioHoraExtra(){
        return this.precioHoraExtra;
    }

    public void setPrecioHoraExtra(int precio){
        this.precioHoraExtra = precio;
    }

    public Double calcularSueldo(){
        return this.getSalarioBase() + this.getHorasExtra()* this.getPrecioHoraExtra();
    }

    @Override
    public String toString() {
        String info;
        info = this.getNombre() + " (" + this.getDni() + ") \n";
        info = info + "Categoria: " + this.getClass().getSimpleName()+ "\n";
        info = info + "Tipo: " + this.tipo+ "\n";
                
        info = info + "Sueldo: " + this.calcularSueldo().toString() + '\n';
        info = info + "email: " + this.getEmail() + "\n";
        info = info + "Sal. Base: " + this.getSalarioBase() + "\n";
        info = info + "h.Extra: " + this.getHorasExtra() + "\n";
        info = info + "pr.Extra: " + this.getPrecioHoraExtra() + "\n";

        return info;
    }
}
