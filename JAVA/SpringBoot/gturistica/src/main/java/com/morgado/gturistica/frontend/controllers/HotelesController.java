package com.morgado.gturistica.frontend.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HotelesController {

    //ruta home
    @GetMapping("/hoteles")
    public String home() {
        return "/frontend/hoteles/index";
    }
    
}
