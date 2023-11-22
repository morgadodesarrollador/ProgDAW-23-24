package html;
import j2html.tags.Tag;
import j2html.tags.specialized.HeadTag;
import j2html.tags.specialized.TableTag;
import j2html.tags.specialized.UlTag;

import j2html.tags.specialized.HtmlTag;
import static j2html.TagCreator.*;


import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Pagina {


    public  void make1(){
        HtmlTag contenido =
          html()
            .attr("lang", "es")
            .with(
                 this.makeHead()
             );



        String pagina = "<!DOCTYPE html>\n" + contenido.render();
        System.out.println(pagina);
    }
    public void make() {

        HtmlTag content =
            html()
             .attr("lang", "es")
             .with(
                    this.makeHead(),
                    body()
                      .with(
                            header()
                                .with(
                                     h1("Hello, World!").attr("class", "rojo")
                                ),
                            section()
                                    .with(
                                       this.crearUsuariosUL(),
                                       this.crearUsuariosTBL()
                                    )
                      )
             );



         String rendered = "<!DOCTYPE html>" + content.render();
         //String rendered = document().render() + content.render();
         this.makeFileHtml(rendered);

    }
    private void  makeFileHtml(String rendered) {
        try {
            File file = new File("index.html");
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
                    title("Mi primera pagina j2html en Java"),
                    link().attr("rel","stylesheet")
                          .attr("type", "text/css")
                          .attr("href", "./estilos.css")
                );
                /*
            head(
                meta().attr("charset","utf-8"),
                title("Mi primera pagina j2html en Java"),
                link().withRel("stylesheet").withHref("estilo.css")
            );*/
    }

    private  Tag<TableTag> crearUsuariosTBL() {
        ArrayList<String> listaNombres = new ArrayList<String>();
        listaNombres.add("Jose");
        listaNombres.add("Antonio");
        listaNombres.add("Rocio");
        listaNombres.add("Marta");
        listaNombres.add("Ana");
        return
           table(
                   each(listaNombres, nombre
                    -> tr().with(
                            td(nombre),
                            td(nombre),
                            td(nombre)
                           )
                   )

           ) ;


    }
    private  Tag<UlTag> crearUsuariosUL() {
        ArrayList<String> listaNombres = new ArrayList<String>();
        listaNombres.add("Jose");
        listaNombres.add("Antonio");
        listaNombres.add("Rocio");
        listaNombres.add("Marta");
        listaNombres.add("Ana");

        return
                ul(
                    each(listaNombres, nombre
                       -> li(nombre).attr("class", "opcion")
                   )
                ).attr("class", "area");

    }

}

