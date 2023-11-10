package listas;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.*;
import org.json.JSONArray;

import java.util.Map;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;


/*
import org.json.JSONObject;
import org.json.JSONArray;
*/

public class JSon {

    public JSon(){
        try{
            String ruta = "/Users/morgado/Personal/Modulos/ProgDAW/JAVA/Conceptos/Listas/src/platos.json";
            FileReader reader = new FileReader(ruta);
            BufferedReader br= new BufferedReader(reader);

            JSONArray array = new JSONArray(br);
            System.out.println(array);
          //  String linea = br.readLine();
          //  System.out.println("--->" + linea);
            /*
            Gson gson = new Gson();
            Map<?,?> platosMap = gson.fromJson(br, Map.class);
            System.out.println(platosMap.get("nombre"));
            System.out.println(platosMap.get("precio"));
            */
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
