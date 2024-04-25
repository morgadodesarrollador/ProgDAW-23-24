package com.morgadoberruezo.picasso.model.repositorios;

import com.morgadoberruezo.picasso.model.entidades.Editores;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EditoresRepository extends JpaRepository<Editores, Integer> {
    
}
