package filejson;
import java.io.FileReader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class App {
    public String rutaplatos = "data/platos.json";
    public String rutamenus = "data/menus.json";
    public ArrayList<Plato> Platos = new ArrayList<Plato>();
    public App(){

      //  this.loadPlatos();
    }

    public void menu() {
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        while (!salir) {
            System.out.println("1.- Cargar datos");
            System.out.println("2.- Insertar un Plato");
            System.out.println("3.- Listar los Platos");
            System.out.println("0.- Salir");
            System.out.print("Seleccione la opcion deseada: ");
            opcion = sn.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("cargando datos...");
                    this.loadPlatos();
                    break;
                case 2:
                    System.out.println("nuevo plato");
                    this.newPlato();
                    break;
                case 3:
                    System.out.println("Listado de Platos");
                    this.listar();
                    break;
                case 0:
                    salir = true;
                    break;
            }
        }
    }
    public  void newPlato(){
        String nombre;
        String tamaño;
        int precio;
        int duracion;
        Scanner sn = new Scanner(System.in);
        System.out.print("Nombre del plato: ");
        nombre = sn.next();
        System.out.print("Precio del plato: ");
        precio = sn.nextInt();
        System.out.print("Duracion del plato: ");
        duracion = sn.nextInt();
        System.out.print("Tamaño del plato: ");
        tamaño = sn.next();
        Plato plato = new Plato(nombre, duracion, tamaño, precio);
        this.Platos.add(plato);
    }

    public void  listar(){
        System.out.println(this.Platos);
        for (Plato plato: this.Platos){

            System.out.println(plato);
        }
    }

    public void loadPlatos(){

        String nombre; int duracion; int precio; String tamaño;
        try {
            System.out.println(this.rutaplatos);
            FileReader platosjson = new FileReader(this.rutaplatos);
            JSONParser parser = new JSONParser();
            Object objPlatos = parser.parse(platosjson);
            JSONObject platosJsonObj = (JSONObject)objPlatos;
            JSONArray LplatosJSon = (JSONArray)platosJsonObj.get("platos");

            for(int i = 0; i < LplatosJSon.size(); i++) {
                JSONObject plato = (JSONObject) LplatosJSon.get(i);
                nombre = (String) plato.get("nombre");
                tamaño = (String) plato.get("tamaño");
                duracion = Integer.parseInt((String) plato.get("duracion"));
                precio =  Integer.parseInt((String) plato.get("precio"));
                Plato plato1 = new Plato( nombre, duracion, tamaño, precio);
                this.Platos.add(plato1);
            }
        }catch (Exception e){

        }
    }
}
