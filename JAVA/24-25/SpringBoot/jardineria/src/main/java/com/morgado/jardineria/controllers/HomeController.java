package com.morgado.jardineria.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


/* 
 * 
 * FW -- mvc, decoradores (servicios, entidades, controladores...)
 * El decorador del FW (SPB) @Controller
 * dotar a la clase para recibir peticiones HTTP (get, post ...)
 */
@Controller
public class HomeController {
    
    /*
    con este decorador --> Tomcat va ejecutar la / del sitio
    * y va a procesos el index.html
    */
    @GetMapping("/")   //rutas de la url
    public String home(){
        return "/frontend/home/index";
    }

    @GetMapping("/qsomos")
    public String qSomos() {
        return "/frontend/home/qsomos";
    }

    @GetMapping("/contacto")
    public String contacto(){
        return "/frontend/home/contacto";
    }
}
