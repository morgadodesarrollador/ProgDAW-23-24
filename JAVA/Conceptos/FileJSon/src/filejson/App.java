package filejson;
import java.io.FileReader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


public class App {
    public String rutaplatos = "data/platos.json";
    public String rutamenus = "data/menus.json";
    public App(){
        this.loadPlatos();
    }

    public void loadPlatos(){
        try {

            FileReader platosjson = new FileReader(this.rutaplatos);
            JSONParser parser = new JSONParser();
            Object objPlatos = parser.parse(platosjson);
            JSONObject platosJsonObj = (JSONObject)objPlatos;
            JSONArray Lplatos = (JSONArray)platosJsonObj.get("platos");
          //  JSONArray Lpclientes = (JSONArray)platosJsonObj.get("clientes");

           // System.out.println(Lplatos);
            for(int i = 0; i < Lplatos.size(); i++) {
                JSONObject plato = (JSONObject) Lplatos.get(i);
                System.out.println("-----" + plato.get("nombre"));
            };


        }catch (Exception e){

        }
    }
}
