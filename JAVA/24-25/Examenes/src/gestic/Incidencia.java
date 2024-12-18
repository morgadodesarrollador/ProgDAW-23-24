package gestic;
import gestic.Aparato;
import gestic.Profesor;

public class Incidencia {
     // Campos
     private int codigo;
     private String titulo;
     private Aparato aparato;
     private Profesor profesor;
     private String prioridad;
     private String estado;
     private double precio;
     private String resolucion;
 
     // Constructor
     public Incidencia(int codigo, String titulo, Aparato aparato, Profesor profesor) {
       
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
         this.estado = estado;
     }
 
     public void setPrecio(double precio) {
         this.precio = precio;
     }
 
     public void setResolucion(String resolucion) {
         this.resolucion = resolucion;
     }

    
 
}
