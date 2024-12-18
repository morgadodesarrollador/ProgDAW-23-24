package gestic;
import gestic.Aparato;
import gestic.Profesor;

public class Incidencia {
     // Campos
     private int codigo;
     private String titulo;
     private Aparato aparato; //1 incidencia tiene 1 aparato
     private Profesor profesor; //1 incidencia tiene 1 profesor
     private String prioridad;
     private String estado;
     private double precio;
     private String resolucion;
 
     // Constructor
     public Incidencia(int codigo, String titulo, Aparato aparato, Profesor profesor) {
       this.setCodigo(codigo);
       this.setTitulo(titulo);
       this.setPrecio(0);
       this.setResolucion("");
       this.setAparato(aparato);
       this.setProfesor(profesor);
       this.setEstado("Pendiente");
       this.setPrioridad("Media");

       //añade esta incidencia a la lista de incidencias del aparato
       //añade esta incidencia a la lista de incidencias del profesor

    //    this.aparato.addIncidencia(this);
    //    this.profesor.addIncidencia(this);
     }
 
     // Getters
     public int getCodigo() {
         return codigo;
     }
 
     public String getTitulo() {
         return titulo;
     }
 
     public Aparato getAparato() {
         return aparato;
     }
 
     public Profesor getProfesor() {
         return profesor;
     }
 
     public String getPrioridad() {
         return prioridad;
     }
 
     public String getEstado() {
         return estado;
     }
 
     public double getPrecio() {
         return precio;
     }
 
     public String getResolucion() {
         return resolucion;
     }
 
     // Setters
     public void setCodigo(int codigo) {
         this.codigo = codigo;
     }
 
     public void setTitulo(String titulo) {
         this.titulo = titulo;
     }
 
     public void setAparato(Aparato aparato) {
         this.aparato = aparato;
     }
 
     public void setProfesor(Profesor profesor) {
         this.profesor = profesor;
     }
 
     public void setPrioridad(String prioridad) {
         this.prioridad = prioridad;
     }
 
     public void setEstado(String estado) {
         //poner la incidencia.estado="Pendiente"
         // y incidencia.aparato.setEstado(false) ---> roto
         this.estado = estado;
         this.aparato.setEstado(false);
     }
 
     public void setPrecio(double precio) {
         this.precio = precio;
     }
 
     public void setResolucion(String resolucion) {
         this.resolucion = resolucion;
     }

     public void resolver(double precio, String resolucion){
        //this.setPrecio, this.setResolucion
        //this.estado="Resuelta"
        this.aparato.estado=true;
     }
public String info() {
        return "Incidencia: " + this.getCodigo() + " - " + this.getTitulo() + "\n"
         +  "   Aparato: " + this.aparato.info() + "\n"
         +  "   Profesor: " + this.profesor.info() + "\n"
         +  "   Estado: " + estado + "\n"
         +  "   Precio: " + precio +  "\n"
         +  "   Resolución: " + resolucion;
     }
    
 
}
