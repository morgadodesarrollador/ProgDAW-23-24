package apiJson;
import java.io.FileReader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.util.ArrayList;
public class FileJSON {

    public String rutaPlatos;
    ArrayList<IPlato> platos = new ArrayList<IPlato>();
    public void loaddatos(){
        this.rutaPlatos = "data/platos.json";
        try{
            JSONParser parser = new JSONParser();
            FileReader reader = new FileReader(this.rutaPlatos);
            Object obj = parser.parse(reader);
            JSONObject pJsonObj = (JSONObject)obj;
            JSONArray array = (JSONArray)pJsonObj.get("platos");
            System.out.println(array);
            for(int i = 0; i < array.size(); i++) {
                JSONObject plato = (JSONObject) array.get(i);

                IPlato platoBis = (IPlato) plato;
                platos.add(platoBis);
                System.out.println("-----"+ plato.get("nombre"));
                System.out.println("-----"+ platoBis.);

            }
            for(IPlato plato: platos) {
                System.out.println("-->" + plato.nombre);
            }

        }catch (Exception e){

        }

    }
    public FileJSON(){
        //"C:\\Users\\kevin\\Desktop\\LeerMenu\\Menu.json");
        this.rutaPlatos = "data/platos.json";
        try{
            JSONParser parser = new JSONParser();
            FileReader reader = new FileReader(this.rutaPlatos);
            Object obj = parser.parse(reader);
            JSONObject pJsonObj = (JSONObject)obj;
            JSONArray array = (JSONArray)pJsonObj.get("platos");
            System.out.println(array);
            for(int i = 0; i < array.size(); i++) {
                JSONObject plato = (JSONObject) array.get(i);

                IPlato platoBis = (IPlato) plato;
                platos.add(platoBis);
                System.out.println("-----"+ plato.get("nombre"));
                System.out.println("-----"+ platoBis.);

            }
            for(IPlato plato: platos) {
                System.out.println("-->" + plato.nombre);
            }

        }catch (Exception e){

        }

    }
}
