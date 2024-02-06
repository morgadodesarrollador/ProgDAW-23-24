package com.morgadoberruezo.picasso.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class UsuariosController {
    @GetMapping("/usuarios")
    public String home(){
        return "/usuarios/index";
    }

    @GetMapping("/usuarios/new")
    public String create() {
        return "/usuarios/new";
    }
    
    @GetMapping("/usuarios/listar")
    public String getAll() {
        return "/usuarios/listar";
    }
    
    //detalle
    //update

}
