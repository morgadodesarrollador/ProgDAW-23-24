package com.morgadoberruezo.picasso.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class LibrosController {
    
    @GetMapping("/libros")
    public String home() {
        return "/libros/index";
    }

    @GetMapping("/libros/new")
    public String create() {
        return "/libros/new";
    }
    
    @GetMapping("/libros/listar")
    public String getAll() {
        return "/libros/listar";
    }
    
}
