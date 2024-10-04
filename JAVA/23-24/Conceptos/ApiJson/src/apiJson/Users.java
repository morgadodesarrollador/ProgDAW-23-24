package apiJson;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.InputStream;
//Conexion a la API
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class Users {

    public JSONArray loaddatos(){
        String nombre = "";
        String email = "";
        JSONObject compania;
        try {
            //defino el objeto URL
            URL url = new URL("https://jsonplaceholder.typicode.com/users");
            //definir el objeto conexión
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            //definimo el método/verbo HTTP (GET, POST, PUT, PATCH, DELETE
            conn.setRequestMethod("GET");
            //establece la conexión con el servidor de jsconplaceholdet (send postman)
            //canal -->
            conn.connect(); //--> canal
            int responseCode = conn.getResponseCode(); //estado de la respuesta
            if (responseCode != 200){
                throw new RuntimeException("Error: " + responseCode);
            }else{
                //data: buffer donde se almacenara la data de la API (stream)
                StringBuilder data = new StringBuilder();
                //definimos un scanner (stream --> flujo de datos)
                Scanner scanner = new Scanner(url.openStream());
                while (scanner.hasNext()){ //mientras haya datos en canal (stream)
                    //almaceno esos datos en el buffer data
                    data.append(scanner.nextLine());
                }
                scanner.close();;
              //  System.out.println(data.toString());
                //parseando (JSON String) --> (JSON java) --> iterar, y acceder a sus propiedades (get/.)
                JSONArray usuarios = new JSONArray(data.toString());
                return usuarios;
/*
                for (Object usuario: usuarios){
                    compania  = (JSONObject) ((JSONObject) usuario).get("company");
                    //System.out.println(compania.get("name"));
                    if (compania.get("name").toString().contains("LLC")){
                        nombre = ((JSONObject) usuario).get("name").toString();
                        email =  ((JSONObject) usuario).get("email").toString();
                        compania  = (JSONObject) ((JSONObject) usuario).get("company");
                        System.out.println( nombre + "/" + email + "/" + compania.get("name"));
                    }
                }*/
            }
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void metodo2(){
        try {
            URL url = new URL("https://jsonplaceholder.typicode.com/users");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();
            //extraemos los datos a través de un InputStream (flujo de datos con la API)
            InputStream flowdata = conn.getInputStream();
            //almacenamos la lectura del inputstream en un array de bytes.
            //Leemos todos los bytes de ese flujo de datos establecido con la api de JSOnPlaceHolder
            byte[] arrStream = flowdata.readAllBytes();
            String dataJson = "";

            //leemos todos esos datos
            for (byte temp: arrStream){
                dataJson += (char)temp;
                //System.out.println((char)temp);
            }
            System.out.println(dataJson + "" + dataJson.length());
            //Parseamos el array JSON String a un array JSON Java
            JSONArray data = new JSONArray(dataJson);
            JSONObject company;
            for (Object obj: data){
                //System.out.println(((JSONObject) obj).get("name"));
                company = new JSONObject(((JSONObject) obj).get("company").toString());
                System.out.println("company: " + company.get("name"));
               // System.out.println(new JSONObject(((JSONObject) obj).get("company").toString()).get("name"));
            }
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


}
