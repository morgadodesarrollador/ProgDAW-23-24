package incidenciastic;

import java.util.ArrayList;

public class Aparato {
    private String codigo;
    private String tipo;
    private String aula;
    private boolean estado;
    public ArrayList<Incidencia> incidencias = new ArrayList<>();


    // Constructor
    public Aparato(String codigo, String tipo, String aula) {
        this.setCodigo(codigo);
        this.setTipo(tipo);
        this.setAula(aula);
        this.estado = true;
        
    }

    // Getters
    public String getCodigo() {
        return codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getAula() {
        return aula;
    }

    public boolean isEstado() {
        return estado;
    }

    // Setters
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    // Método para mostrar la información
    public String info() {
        return ("Aparato: "+ this.getCodigo()
                + " / " + this.getTipo() + " - " + this.getAula() + " " 
                + (this.isEstado() ? "Funcional" : "No funcional"));
    }
}
