package com.morgado.gturistica.frontend.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ApartamentosController {

    //ruta home
    @GetMapping("/apartamentos")
    public String home() {
        return "/frontend/apartamentos/index";
    }

    //ruta obtener todos --> ENDPOINT
    @GetMapping("/apartamentos/listar")
    public String getAll() {
        return "/frontend/apartamentos/listar";
    }
  
    
    
    
}
