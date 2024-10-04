package usuarios;

import j2html.tags.Tag;
import static j2html.TagCreator.*;
import j2html.tags.specialized.*;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;


public class UsuariosView {

    ArrayList<Object> Lusuarios = new ArrayList<Object>();
    JSONArray usuarios;
    private void parse(){
        if (this.usuarios != null){
            for (int i=0; i<this.usuarios.length(); i++){
                this.Lusuarios.add(this.usuarios.get(i));
            }
        }
    }

    public void getUsuarios(JSONArray usuarios){
        this.usuarios = usuarios;
        this.parse();
        //pintar con el J2Html ese array de objetos
        HtmlTag contenido =
         html()
            .attr("lang", "es")
            .with(
                    this.makeHead(),
                    body(
                       this.makeTable(usuarios)
                    )
            );

        String rendered = "<!DOCTYPE html>" + contenido.render();
        this.makeFileHtml(rendered);

    }
    public Tag<TableTag> makeTable (JSONArray usuarios){

        return table(
           thead(
                tr(
                    td("Nombre"),
                    td("Usuario"),
                    td("Correo Electrónico"),
                    td("Teléfono"),
                    td("Página web")
               ).attr("class", "FilaCampos")
           ),
           each(this.Lusuarios, usuario
              -> tr().with(
                  td( ((JSONObject) usuario).get("name").toString()),
                  td( ((JSONObject) usuario).get("username").toString()),
                  td( ((JSONObject) usuario).get("email").toString()),
                  td( ((JSONObject) usuario).get("phone").toString()),
                  td( ((JSONObject) usuario).get("website").toString())
                ).attr("class", "restosFilas")
           )
        );
    }

    private void  makeFileHtml(String rendered) {
        try {
            File file = new File("usuarios.html");
            FileWriter out = new FileWriter(file);
            out.write(rendered);
            out.close();
        } catch (IOException ioe) {
        }
    }

    private  Tag<HeadTag> makeHead(){
        return
                head()
                        .with(
                                meta().attr("charset","utf-8"),
                                title("Usuarios JSONPlaceHolder"),
                                link().attr("rel","stylesheet")
                                        .attr("type", "text/css")
                                        .attr("href", "./estilos.css")
                        );
    }
    public void getUsuario(){
        //mostrar pagina de detalle de 1 usuario
    }
    public void newUsuario(){
        //formulario html --> un objetop
    }
}
