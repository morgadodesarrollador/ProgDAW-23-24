package incidenciastic;

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
         this.codigo = codigo;
         this.titulo = titulo;
         this.aparato = aparato;
         this.profesor = profesor;
         this.prioridad = "media"; // Valor por defecto
         this.estado = "Pendiente"; // Valor por defecto
         this.precio = 0;
         this.resolucion = "";
         this.aparato.setEstado(false);
        //  this.profesor.incidencias.add(this);
        //  this.aparato.incidencias.add(this);
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

     public void resolver(String titulo, int precio) {
        this.setPrecio(precio);
        this.setResolucion(titulo);
        this.aparato.setEstado(true);
        this.setPrioridad("baja");
        this.setEstado("Resuelta");
     }
 
     // Método para mostrar la información
     public String info() {
        return "Incidencia: " + this.getCodigo() + " - " + this.getTitulo() + "\n"
         +  "   Aparato: " + this.aparato.info() + "\n"
         +  "   Profesor: " + this.profesor.info() + "\n"
         +  "   Prioridad: " + prioridad + "\n"
         +  "   Estado: " + estado + "\n"
         +  "   Precio: " + precio +  "\n"
         +  "   Resolución: " + resolucion;
     }
}
