package com.morgadoberruezo.picasso.model.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.morgadoberruezo.picasso.model.entidades.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>  {
   // crud basico (jpa) + 
    //tus funciones sql personalizadas  --> createquerybuilder("sql")
}

