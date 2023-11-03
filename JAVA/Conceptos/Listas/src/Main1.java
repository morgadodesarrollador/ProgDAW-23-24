
import java.util.ArrayList;

public class Main1 {
    public static void main(String[] args) {
        ArrayList<String> colores = new ArrayList<String>();
        System.out.println("Num elem = " + colores.size());

        colores.add("rojo");
        colores.add("azul");
        colores.add("negro");
        colores.add(2, "rosa");
        colores.add("azul");
        colores.add("naranja");
        colores.add("amarillo");
        colores.add("azul");
       // colores.remove(4); //borra azul
       // colores.remove("azul");
     //   System.out.println("existe el azul " + colores.contains("blanco") + " en pos " + colores.indexOf("blanco"));
        while (colores.contains("azul")){
            colores.remove(colores.indexOf("azul"));
            //colores.remove("azul");
        }
       // for (int i=0; i<colores.size(); i++){
      //      if (colores.get(i)=="azul"){
        //        colores.remove("azul");
        //    }
       // }

        System.out.println("Num elem = " + colores.size());
        for (int i = 0; i<colores.size(); i++) {
            System.out.println("Pos "+i +" = " + colores.get(i));
        }


    }
}