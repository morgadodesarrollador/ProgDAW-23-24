package com.morgadoberruezo.picasso.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
        this.uService.save(newUsuario);
        return "redirect:/usuarios/listar";
    }
    
    @GetMapping("/usuarios/listar")
    public String getAll(Model model) {
        model.addAttribute("listaUsuarios", this.uService.getAll());
        return "/usuarios/listar";
    }
    
    //detalle
    //update
    @GetMapping("/usuarios/edit/{id}")
    public String edit(@PathVariable long id, Model model) {
        Usuario usuario = this.uService.findUserById(id);
        if (usuario != null){
            model.addAttribute("usuarioForm", usuario);
            return "/usuarios/new";
        }else {
            return "redirect:/usuarios/new";
        }  
    }


    @GetMapping("/usuarios/delete/{id}")
    public String delete(@PathVariable long id, Model model) {
        this.uService.delete(id);
        return "redirect:/usuarios/listar";
    }
}
