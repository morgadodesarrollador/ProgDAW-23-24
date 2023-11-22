package listas;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.*;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.Map;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
public class JSon {
    public JSon(){
        try{
            String ruta = "/Users/morgado/Personal/Modulos/ProgDAW/JAVA/Conceptos/Listas/src/platos.json";
            FileReader reader = new FileReader(ruta);
            BufferedReader br= new BufferedReader(reader);
            Gson gson = new Gson();
            JsonParser parser = new JsonParser();
            JsonElement datos = parser.parse(br);

            JsonObject jobject = datos.getAsJsonObject();
            JsonArray platos = jobject.getAsJsonArray("platos");
            JSONArray platosArray = new JSONArray(platos.toString());

            for (int i=0; i<platosArray.length(); i++){
                JSONObject nodo = platosArray.getJSONObject(i);
                System.out.println(nodo.getString("nombre") + " " + nodo.getString("duracion") );
                System.out.println("-------------");
            }
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
