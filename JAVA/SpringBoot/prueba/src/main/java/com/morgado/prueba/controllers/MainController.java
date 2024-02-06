package com.morgado.prueba.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;




@Controller
public class MainController {

    @GetMapping("/")
    public String home(){
        return "home";
    }

    @GetMapping("/contacto")
    public String contacto(){
        //.... invoca al Servicio --> a la BD
        return "contacto";
    }


    @GetMapping("/welcome")
    //public String welcome(@RequestParam String param) {
    public String welcome(Model  model) {
        model.addAttribute("mensaje", "Hola Mundo");
        return  "index";
    }

    @GetMapping("/saludo")
    public String saludo(Model model) {
        model.addAttribute("saludo", "Openwebinars");
        return "saludo";
    }

    @GetMapping("/libro")
    public String getLibro (
        @RequestParam(name="isbnReq", required=true, defaultValue="aaa-123") String isbnCont,
        @RequestParam(name="genero") String genero,
        Model modelo
    ) {
        modelo.addAttribute("isbnVista", isbnCont);
        modelo.addAttribute("genero", genero);
        return "libro";
    }
    
    
    @GetMapping("/datos")
    public String getCliente(
        @RequestParam (name="nombre", required = false, defaultValue = "pepe") String nombre,
        @RequestParam ("edad") String edad,
        @RequestParam ("cantidad") String cantidad,
        Model model
        ) {
            model.addAttribute("nombre", nombre);
            model.addAttribute("edad", edad);
            model.addAttribute("cantidad", cantidad);
            return "cliente";
    }
    
    
}

