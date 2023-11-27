package usuarios;

import org.json.JSONArray;

public class UsuariosController {
    UsuariosService usuariosService = new UsuariosService();
    UsuariosView usuariosView = new UsuariosView();
    public void getUsuarios(){
        JSONArray usuarios;
        usuarios = this.usuariosService.getUsuarios();
        usuariosView.getUsuarios(usuarios);
    }
}
