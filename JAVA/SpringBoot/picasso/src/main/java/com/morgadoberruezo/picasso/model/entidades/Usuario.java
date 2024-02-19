package com.morgadoberruezo.picasso.model.entidades;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

public class Usuario {
    
    //propiedades
    @Min(value=0)
    private long id;

    @NotEmpty
    private String nombre;

    @NotEmpty
    private String email;

    private String telefono;

    private String imagen;

    public Usuario() { }
    public Usuario(@Min(0) long id, @NotEmpty String nombre, @NotEmpty String email) {
        this.setId(id);;
        this.setNombre(nombre);
        this.setEmail(email);
    }
    public Usuario(@Min(0) long id, @NotEmpty String nombre, @NotEmpty String email, String telefono, String imagen) {
        this(id, nombre, email);
        this.setImagen(imagen);
        this.setTelefono(telefono);
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        //verificar la cadena del email
        this.email = email;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getImagen() {
        return imagen;
    }
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    @Override
    public String toString() {
        return "Usuario [id=" + id + ", nombre=" + nombre + ", email=" + email + ", telefono=" + telefono + ", imagen="
                + imagen + "]";
    }

    

    //constructor
 

    // setters y getters
    
    //otros métodos

    //toString

  
}
