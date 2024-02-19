package com.morgadoberruezo.picasso.model.services;
import org.springframework.stereotype.Service;
import com.morgadoberruezo.picasso.model.entidades.Cliente;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.annotation.PostConstruct;

@Service
public class ClientesService {
    private List<Cliente> repositorio = new ArrayList<>();
	
	public Cliente add(Cliente e) {
		repositorio.add(e);
		return e;
	}
	public List<Cliente> findAll() {
		return repositorio;
	}
	public Cliente findById(long id) {
		Cliente result = null;
		boolean encontrado = false;
		int i = 0;
		while (!encontrado && i < repositorio.size()) {
			if (repositorio.get(i).getId() == id) {
				encontrado = true;
				result = repositorio.get(i);
			} else {
				i++;
			}
		}	
		return result;
	}
	public Cliente edit(Cliente e) {
		boolean encontrado = false;
		int i = 0;
		while (!encontrado && i < repositorio.size()) {
			if (repositorio.get(i).getId() == e.getId()) {
				encontrado = true;
				repositorio.remove(i);
				repositorio.add(i, e);
			} else {
				i++;
			}
		}
		if (!encontrado)
			repositorio.add(e);	
		return e;
	}
	@PostConstruct
	public void init() {
		repositorio.addAll(
				Arrays.asList(
					new Cliente(1,"Antonio García", "antonio.garcia@openwebinars.net", "954000000"),
					new Cliente(2,"María López", "maria.lopez@openwebinars.net", "954000000"),
					new Cliente(3,"Ángel Antúnez", "angel.antunez@openwebinars.net", "954000000")						
				)
		);
	}
    
}

