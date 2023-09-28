package personas;

public class Persona {
    private String dni;
    private int edad;
    private String nombre;

    public Persona(String dni, String nombre, int edad){
        this.setDni(dni);
        this.setNombre(nombre);
        this.setEdad(edad);
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
}
