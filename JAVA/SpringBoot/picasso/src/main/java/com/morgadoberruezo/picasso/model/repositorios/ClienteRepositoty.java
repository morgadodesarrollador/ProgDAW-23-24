package com.morgadoberruezo.picasso.model.repositorios;

import org.springframework.data.repository.CrudRepository;

import com.morgadoberruezo.picasso.model.entidades.ClienteJPA;

public interface ClienteRepositoty extends CrudRepository<ClienteJPA, Long> {
    
}
