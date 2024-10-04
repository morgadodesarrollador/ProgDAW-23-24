
//una clase OO
public class App {
    int valor = 10;
    // Una clase contiene propiedades y métodos
    //propiedades --> variables de una clase
    //métodos --> funciones de la clase
    /* 
     método o función main() y es el punto de entrada a nuestro
     proyecto. En el método main() comienza la ejecución de la 
     clase
    */
    public static void main(String[] args) throws Exception {
        //creacion de variables dentro de un método
        int valor = 5;
        double comision = 15.5;
        String nombre = "Jose Antonio";
        String apellidos = "Morgado"; //Clase String de java --> métodos
        // string ciudad = "Almeria"; //tipo basico cadena de caracteres no es clase no tiene métodos
        String nombreCompleto; 
        nombreCompleto = nombre + " " + apellidos;
        nombreCompleto.concat(nombre).concat(" ").concat(apellidos);
        System.out.println(nombreCompleto.length());
        // System.out.println("Nombre = " + nombreCompleto.concat(" y eres de ").concat(ciudad));
        // System.out.println(("Vives en ").concat(ciudad));
        
        System.out.printf(("Vives en ").concat(nombre)+"\n");
        System.out.printf(("Vives en ").concat(nombre));

        // System.out.printf("%20s %10s %10s%n", "Producto", "Cantidad", "Precio");
        // System.out.printf("%20s %10d  %10.2f%n", "Portatil", 10, 1300.45);
        
        
    }

    private void calcularPeso(){

    }

    private double calcularPotencia(){
        //...
        return 250.4;
    }
}

