import org.json.JSONArray;
import usuarios.UsuariosController;


public class Main {
    public static void main(String[] args) {
        UsuariosController usuariosController = new UsuariosController();
        usuariosController.getUsuarios();
    }
}