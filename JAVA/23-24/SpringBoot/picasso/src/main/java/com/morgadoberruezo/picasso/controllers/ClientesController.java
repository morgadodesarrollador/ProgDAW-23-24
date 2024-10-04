package com.morgadoberruezo.picasso.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.morgadoberruezo.picasso.model.entidades.Cliente;
import com.morgadoberruezo.picasso.model.services.ClientesService;


@Controller
public class ClientesController {

    @Autowired
    private ClientesService clientesService;

    @GetMapping("/clientes")
    public String home() {
        return "/clientes/index";
    }
    @GetMapping({"/clientes/listar"})
    public String listado(Model modelo) {
        modelo.addAttribute("listaClientes", clientesService.findAll());
        return  "/clientes/listar";
    }

    @GetMapping("/clientes/new")
	public String create(Model model) {
		model.addAttribute("clienteForm", new Cliente());
		return "/clientes/new";
	}

    @PostMapping("/clientes/save")
	public String save(@ModelAttribute("empleadoForm") Cliente newCliente) {
		clientesService.add(newCliente);
		return "redirect:/clientes/listar";
	}
    
    
}
