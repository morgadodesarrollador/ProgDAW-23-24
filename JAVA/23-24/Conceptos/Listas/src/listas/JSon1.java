package listas;

import com.google.gson.*;
import org.json.JSONArray;
import java.util.Map;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class JSon1 {
    public JSon1(){
        try{
            String ruta = "/Users/morgado/Personal/Modulos/ProgDAW/JAVA/Conceptos/Listas/src/platos.json";
            FileReader reader = new FileReader(ruta);
            BufferedReader br= new BufferedReader(reader);
          //  String linea = br.readLine();
          //  System.out.println("--->" + linea);
            Gson gson = new Gson();
            Map<?,?> platosMap = gson.fromJson(br, Map.class);
            System.out.println(platosMap.get("nombre"));
            System.out.println(platosMap.get("precio"));
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
