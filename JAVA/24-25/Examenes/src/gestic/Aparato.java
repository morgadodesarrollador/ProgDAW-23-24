package gestic;
import gestic.Incidencia;
import java.util.ArrayList;

public class Aparato {
    private String codigo;
    private String tipo;
    private String aula;
    private boolean estado;
    private ArrayList<Incidencia> incidencias = new ArrayList<Incidencia>();


    // Constructor
    public Aparato(String codigo, String tipo, String aula) {
        this.setCodigo(codigo);
        this.setTipo(tipo);
        this.setAula(aula);
        //defecto está ok al darlo de alta
        this.setEstado(true); 
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

    public boolean getEstado(){
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
        //comprobaciones
        this.estado = estado;
    }

    public void addIncidencia(Incidencia inc){
        //añade la incidencia inc a las incidencias del aparato
        this.incidencias.add(inc);
    }

    public ArrayList<Incidencia> getIncidencias(){
        return this.incidencias;
    }


    // Método para mostrar la información
    public String info() {
        return ("Aparato: "+ this.getCodigo()
                + " / " + this.getTipo() + " - " + this.getAula()+ " " 
                + (this.getEstado() ? "Funciona" : "No Funciona"));
    }
}
