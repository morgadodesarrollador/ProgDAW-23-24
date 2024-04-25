package com.morgadoberruezo.picasso.controllers;

import java.util.ArrayList;
// import java.util.List;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.morgadoberruezo.picasso.model.entidades.Usuario;
import com.morgadoberruezo.picasso.model.services.UsuariosService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
public class UsuariosController {
    //inyectar el servicio UsusariosService en el controlador en la propiedad
    //uService
   
    @Autowired
    private UsuariosService uService;
    
    @GetMapping("/usuarios")
    public String home(){
        return "/usuarios/index";
    }

    @GetMapping("/usuarios/new")
    public String create(Model model) {
        model.addAttribute("usuarioForm", new Usuario());
        return "/usuarios/new";
    }
    
    @PostMapping("/usuarios/save")
    public String save(@ModelAttribute("usuarioForm") Usuario newUsuario) {
        newUsuario.setImagen("logo.png");
        // this.uService.save(newUsuario);
        this.uService.create(newUsuario);
        return "redirect:/usuarios/listar";
    }
    
    @GetMapping("/usuarios/listar")
    public String  getAll(Model model) {
        //1-. el controlador SOLICITA al MODELO (Servicio) el listado de usuarios
        // List<Usuario> usuarios =  this.uService.getAll();
        List<Usuario> usuarios =  this.uService.getAll();
        model.addAttribute("listaUsuarios", usuarios);
        // return {
        //     msg: 'Datos recibidos',
        //     status: 200,
        //     data: usuarios;
        // }
        return "/usuarios/listar";
    }
    
    //detalle
    //update
    @GetMapping("/usuarios/edit/{id}") //endpoint
    public String edit(@PathVariable long id, Model model) {
        //Model es un área de memoria interna de comuniciación
        //de variables entre el contralador/edit y la plantilla
        ///usuarios/new
        
        //traer ese registro (objeto con ese id) de la BD
        //select * from usuarios where id = ${id}
     
        // Usuario usuario = this.uService.findUserById(id);
        Usuario usuario = this.uService.getMethod(id);
        
        if (usuario != null){
            model.addAttribute("usuarioForm", usuario);
            return "/usuarios/new";
        }else {
            return "redirect:/usuarios/new";
        }  
    }
// endpoint
    @GetMapping("/usuarios/delete/{id}") 
    public String delete(@PathVariable long id) {
        System.out.println("Borrando al usuario " + id);
        this.uService.deleteMethod(null);
        return "redirect:/usuarios/listar"; //ejecuta la URL
    }
}
