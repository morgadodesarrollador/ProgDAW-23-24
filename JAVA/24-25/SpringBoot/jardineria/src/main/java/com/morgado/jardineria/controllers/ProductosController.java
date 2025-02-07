package com.morgado.jardineria.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class ProductosController {
    
    @GetMapping("/productos")
    public String home(){
        return "/frontend/productos/index";
    }

    @GetMapping("/productos/listar")
    public String listar() {
        return "/frontend/productos/listar";
    }
    

    
}
