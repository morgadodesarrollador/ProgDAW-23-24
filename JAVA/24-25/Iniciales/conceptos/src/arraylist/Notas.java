package arraylist;
import java.util.ArrayList;

//son arrays DINAMICOS
// *p **p &(*p) --> punteros en C y C++ --> array de listas 
public class Notas {
    
    static ArrayList<String> nombres = new ArrayList<>();
    
    // ArrayList<Autor> autores = new ArrayList<Autor>()

   // ArrayList<T> --> Tipo dinamico 
    public static void main (String[] args){

        //Agrgar elementos
        //for ... pidiendo datos de autores
       // autor = new Autor(p1, p2, ..)
       // autores.add(autor);
        Notas.nombres.add("Juan"); //0
        Notas.nombres.add("Ana");  //1
        Notas.nombres.add("Maria"); //2
        Notas.nombres.add("Juana"); //3
        

        //Acceso a los elementos del array
        //nota = Notas[i] --> Array estático
        System.out.println(Notas.nombres.get(2));  

        //Tamaño del array
        //length era el tamaño del array estático
        System.out.println(Notas.nombres.size());

        //modificar una posicón
        //notas[2] = "Morgado"
        Notas.nombres.set(2, "Morgado");
        System.out.println(Notas.nombres.get(2));

        //eliminar
        Notas.nombres.remove(2);
        System.out.println(Notas.nombres.get(2));

        //recorrido. 
        //Met. Tradicional --> acceso por indice
        for (int i=0; i<Notas.nombres.size(); i++){
            System.out.println(i + " : "+ Notas.nombres.get(i));
        }

        //Moderna --> Mayoria de los Lenguajes-- foreach
        //se repite mientras hay elementos en el array/coleccion/lista ..
        //y en "elemento" habra el objeto de esa iteracion
        for (String elemento: Notas.nombres){
            System.out.println(elemento);
        } 

    }

}
