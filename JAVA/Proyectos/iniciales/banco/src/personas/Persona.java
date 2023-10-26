package personas;

import cuentas.Cuenta;

public class Persona {
    private String dni;
    private int edad;
    private String nombre;
    public Cuenta[] cuentas;

    public Persona(String dni, String nombre, int edad, int NumCtas){
        this.setDni(dni);
        this.setNombre(nombre);
        this.setEdad(edad);
        cuentas = new Cuenta[NumCtas];

        // 1.todos --> cuentas = new Cuenta[3];
        // 2.según un criterio (edad, tipo_trabajo ...)
        // if (edad > 18)
        //     cuentas = new Cuenta[3];
        // else    
        //     cuentas = new Cuenta[1];
        //3.Mediante un parámetros (NumCtas) en la creación del obj Persona
    }

    public void setDni(String dni) {
        //controlar el patrón del nif (8N)-(1L)
        this.dni = dni.toUpperCase();
    }

    public String getDni() {
        return dni.toLowerCase();
    }

    public void setEdad(int edad) {
        if (edad > 0){
            this.edad = edad;
        }else {
            System.err.println("Error Crear Persona: edad > 0");
        }
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public Cuenta saldoMaximo(){
        Cuenta cmax;
        int max = this.cuentas[0].getSaldo();
        cmax = this.cuentas[0];
        for (int i=1; i<cuentas.length; i++){
            if (max < this.cuentas[i].getSaldo()){
                max = this.cuentas[i].getSaldo();
                cmax = this.cuentas[i];
            }
        }
        return cmax;
    }
    public int  saldoTotal(){
        int suma = 0;
        for (int i = 0; i < this.cuentas.length; i++){
            suma = suma + this.cuentas[i].getSaldo();
        }
        return suma;
    }
}
