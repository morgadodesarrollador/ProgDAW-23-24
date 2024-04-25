package com.morgadoberruezo.picasso.model.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.morgadoberruezo.picasso.model.entidades.Editores;
import com.morgadoberruezo.picasso.model.services.Implementations;
import com.morgadoberruezo.picasso.model.repositorios.EditoresRepository;

@Service
public class EditoresService implements Implementations<Editores> {
    @Autowired
    EditoresRepository editoresRep; 

    @Override
    public void create(Editores obj) {
        this.editoresRep.save(obj);
    }
    @Override
    public void delete(Integer id) {
        this.editoresRep.deleteById(id);
    }

    @Override
    public Editores getId(Integer id) {
        return this.editoresRep.findById(id).get();
    }

    @Override
    public List<Editores> getAll() {
        return this.editoresRep.findAll();
    }
}
