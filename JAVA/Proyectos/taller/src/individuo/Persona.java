package individuo;

public class Persona {
    private int     fnac   = 2000;
    public  String  nombre;
    public  String  ciudad;

    public Persona(String nom, String ciu, int fecha){ 
        // método constructor ... p =  new Persona ('Ana', 'Almeria', 2010)
        this.nombre = nom;
        this.ciudad = ciu;
        this.fnac = fecha;
    }
    // métodos get/set getters/setters

    //métodos que operan sobre atributos para realizar calculos
    public int obtenerEdad(int anioAct) {
        int edad = 0; 
        edad = anioAct - this.fnac;
        return edad;
    }
    //método main --> comienza a ejecutar la clase
    public static void main(String[] args){
    }
}