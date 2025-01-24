package com.morgado;

import java.util.Scanner;

public class Contable extends Empleado {
    private int plusSalario;
    protected int oficina;

    Contable(){
        super();
        this.setHorasExtra(15);
        this.setPlusSalario();
        this.calcularSueldo();
    }
    Contable (String dni, String nombre){
        super(dni, nombre);
        this.setPlusSalario();
    }

    Contable (String dni, String nombre, String email, int hExtras, int oficina){
        super(dni, nombre, email, hExtras);
        this.setOficina(oficina);
        this.setHorasExtra(10);

        this.setPlusSalario();
        this.tipo = "Contable";
    }

    public void PedirDatos(){
        Scanner entrada = new Scanner(System.in); 
        super.PedirDatos();
        System.out.println("-----------------------------");
        System.out.print("Oficina: ");
        int oficina = entrada.nextInt();
        entrada.nextLine(); // Limpiar buffer
        this.setOficina(oficina);
        this.tipo = "Contable";
    }

    public void setOficina(int ofi){
        this.oficina = ofi;
    }

    public int getOficina(){
        return this.oficina;
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
