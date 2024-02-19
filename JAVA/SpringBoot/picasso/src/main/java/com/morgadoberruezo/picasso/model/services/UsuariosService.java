package com.morgadoberruezo.picasso.model.services;
import org.springframework.stereotype.Service;
import com.morgadoberruezo.picasso.model.entidades.Usuario;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.annotation.PostConstruct;

@Service
public class UsuariosService {
    private List<Usuario> repositorio = new ArrayList<>();

    public void add (Usuario u){
        this.repositorio.add(u);
      //  return u;
    }

    public List<Usuario> getAll(){
        return this.repositorio;
    }

    public int findById(long id) {
        boolean encontrado = false;
        int i=0;
        int posicion = -1;
        while (!encontrado && i<repositorio.size()){
            if (repositorio.get(i).getId() == id){
                posicion = i;
                encontrado = true;
            }else
                posicion = -1;
            i++;
        }
        return posicion;
    }

    public Usuario findUserById(long id) {
		Usuario result = null;
        int posicion = this.findById(id);
        if (posicion != -1)
            result = repositorio.get(posicion);
        
        return result;
	}
    
    public Usuario save(Usuario u) {
		int posicion = this.findById(u.getId());
        if (posicion != -1){
            this.repositorio.remove(posicion);
			this.repositorio.add(posicion, u);
        }else
			this.repositorio.add(u);	
		return u;
	}
    

    public boolean delete(long id){
        int posicion = this.findById(id);
        if (posicion != -1){
            this.repositorio.remove(posicion);
            return true;
        }else 
            return false;
    }
    //carga asincrona
    @PostConstruct
    public void init(){ 
        // el método init() volcara los usuarios de la BD en el repositorio 
        this.repositorio.addAll(
            Arrays.asList(
					new Usuario(
                        1,
                        "Antonio García",
                        "antonio.garcia@openwebinars.net",
                        "954000000",
                        "antonio.png"
                    ),
					new Usuario(
                        2,
                        "María López", 
                        "maria.lopez@openwebinars.net", 
                        "954000000", 
                        "maria.png"),
					new Usuario(
                        3,"Ángel Antúnez", 
                        "angel.antunez@openwebinars.net", 
                        "954000000", 
                        "angel.png"),
                    new Usuario(
                        4,"jose Antonio Morgado", 
                        "morgado@gmail.com", 
                        "954000000", 
                        "morgado.png")								
				)
        );
    }
    
}
