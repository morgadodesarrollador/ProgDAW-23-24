package usuarios;
import org.json.JSONArray;
import org.json.JSONObject;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class UsuariosService {

    public void newUsuario(){

    }
    public void getUsuario(){
        //URL url = new URL("https://jsonplaceholder.typicode.com/users/i");
    }
    public JSONArray getUsuarios(){
        //petición a la API
        try{
            //1-. ESTABLECER LA CONEXIÓN
            //String url2 = "https://jsonplaceholder.typicode.com/users";
            URL url = new URL("https://jsonplaceholder.typicode.com/users");
            //establecer la conexión con el servidor
            HttpURLConnection conexion = (HttpURLConnection) url.openConnection();
            //establecemos el verbo/método de acceso al recurso del protocolo http
            conexion.setRequestMethod("GET");
            conexion.connect();
            //obtenemos el codigo de la conexion
            int responseCode = conexion.getResponseCode();
            if (responseCode != 200){
                throw new RuntimeException("Error: " + responseCode);
            }else{ //obenemos data --> 200.
                System.out.println("Code " + responseCode);
                //2-. REALIZAR LA TRANSEFERENCIA DE DATOS ENTRE CLiente(Servicio) y el Servidor
                StringBuilder bufferData = new StringBuilder();
                //recoger datos de Stream --> fuente continua de datos -- FLUJO DE DATOS
                Scanner scanner = new Scanner(url.openStream());
                while(scanner.hasNext()){
                    bufferData.append(scanner.nextLine());
                }
                scanner.close(); //cerrar el flujo de datos
            //    System.out.println(bufferData.toString());
                //PARSEAR: transformar JSonString --> JSonArray de JAVA/C#/TS/Android ...

                JSONArray usuarios = new JSONArray(bufferData.toString());
                return usuarios;
            }






        }catch (Exception e){
            //error genérico
            throw new RuntimeException(e);
        }
    }
}
