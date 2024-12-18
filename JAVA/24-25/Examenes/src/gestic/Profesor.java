package gestic;

import java.util.ArrayList;

public class Profesor {
    private String nif;
    private String nombre;
    private String departamento;
    private ArrayList<Incidencia> incidencias = new ArrayList<Incidencia>();


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

    public void addIncidencia(Incidencia inc){
        //añade la incidencia inc a las incidencias del profesor
        this.incidencias.add(inc);
    }

    public ArrayList<Incidencia> getIncidencias(){
        return this.incidencias;
    }
    // Método para mostrar la información
    public String info() {
        return "Profesor:" + this.getNif() + " / " + this.getNombre() + "(" + this.getDepartamento() + ")";

    }
}

    