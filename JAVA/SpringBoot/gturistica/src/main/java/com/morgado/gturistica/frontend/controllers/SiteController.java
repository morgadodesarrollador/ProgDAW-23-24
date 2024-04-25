package com.morgado.gturistica.frontend.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class SiteController {


    //index sitio
    @GetMapping("/")
    public String home() {
        return "/frontend/site/home.html";
    }

    //servicios
    @GetMapping("/servicios")
    public String servicios() {
        return "/frontend/site/servicios.html";
    }

    //quienesSomos
    @GetMapping("/quienessomos")
    public String qsomos() {
        return "/frontend/site/qsomos.html";
    }

    //empresa
    @GetMapping("/empresa")
    public String empresa() {
        return "/frontend/site/empresa.html";
    }
    //contacto
    @GetMapping("/contacto")
    public String contacto() {
        return "/frontend/site/contacto.html";
    }
    
}
