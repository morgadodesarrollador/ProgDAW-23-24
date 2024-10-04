package com.morgadoberruezo.picasso.model.entidades;

import javax.validation.constraints.*;
import jakarta.persistence.*;

@Entity
@Table(name="Usuarios")
public class Usuario {
    
    //propiedades
    @Id
    @Min(value=0)
    private long id;

    @NotEmpty
    @Column(name="nombre", nullable=false)
    private String nombre;

    @NotEmpty
    @Column(name="email", nullable=false)
    private String email;

    @Column(name="telefono", nullable=true)
    private String telefono;

    @Column(name="ciudad", nullable=true)
    private String ciudad;

    @Column(name="domicilio", nullable=true)
    private String domicilio;

    @Column(name="imagen", nullable=true)
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
