package biblioteca;
import biblioteca.Autor;
import java.util.Scanner;

public class Libro {
    private int codigo;
    private String titulo;
    private int anio;
    private Autor autor; //Fk 1 Libro --> 1 Autor
    private boolean prestado;
    public int precio;
    public String categoria; //Progr, Redes, BD
    public  Scanner entrada = new Scanner(System.in); 



    public Libro(int codigo){
        this.setCodigo(codigo);
        this.PedirDatos();
    }

    public void PedirDatos(){

        System.out.println("Libro con Codigo: " + this.codigo);
        System.out.println("-----------------------------");
        System.out.print("Titulo: ");
        String titulo = this.entrada.next();
        this.setTitulo(titulo);
        System.out.print("Año: ");
        int anio = this.entrada.nextInt();
        this.setAnio(anio);
        this.setPrestado(false);
    }

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo.toUpperCase();
    } 
    
    public void setAnio(int anio){
        this.anio = anio;
    }

    public void setPrestado(boolean prestado){
        this.prestado = prestado;
    }

    public void setAutor(Autor autor){
        this.autor = autor;
    }

    public Autor getAutor(){
        return this.autor;
    }

    public void info(){
        System.out.println(
                "Libro "+ this.codigo + " : " 
                    + "(" + this.titulo + "-" + this.anio + " / " 
                    + this.autor.getNombreCompleto() + " - " 
                    + Integer.toHexString(System.identityHashCode(this.autor)) +")" );
 

    }

}
