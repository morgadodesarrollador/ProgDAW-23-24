package incidenciastic;

import java.util.ArrayList;

public class Profesor {
    private String nif;
    private String nombre;
    private String departamento;
    public ArrayList<Incidencia> incidencias = new ArrayList<>();


    // Constructor
    public Profesor(String nif, String nombre, String departamento) {
        this.setNif(nif);;
        this.setNombre(nombre);
        this.setDepartamento(departamento);
    }

    // Getters
    public String getNif() {
        return nif;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    // Setters
    public void setNif(String nif) {
        this.nif = nif;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    // Método para mostrar la información
    public String info() {
        return "Profesor:" + this.getNif() + " / " + this.getNombre() + "(" + this.getDepartamento() + ")";

    }
}

    