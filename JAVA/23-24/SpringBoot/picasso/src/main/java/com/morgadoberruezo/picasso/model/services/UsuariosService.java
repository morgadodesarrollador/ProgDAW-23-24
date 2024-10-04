package com.morgadoberruezo.picasso.model.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.morgadoberruezo.picasso.model.entidades.Usuario;
import com.morgadoberruezo.picasso.model.repositorios.UsuarioRepository;
import com.morgadoberruezo.picasso.model.services.Implementations;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.annotation.PostConstruct;

@Service
public class UsuariosService implements Implementations<Usuario> {
    @Autowired //inyección dinámica de código. 
    UsuarioRepository usuarioRepository;
    
    @Override
    public void create(Usuario obj) {
      //   System.out.println(obj);
      //   this.usuarioRepository.save(obj);
    }

    @Override
    public void delete(Long id) {
      //  this.usuarioRepository.deleteById(null);
    }

    @Override
    public Usuario getId(Long id) {
       return this.usuarioRepository.findById(null).get();
    }

    @Override
    public List<Usuario> getAll() {
       return this.usuarioRepository.findAll();
    }
    
    
}
