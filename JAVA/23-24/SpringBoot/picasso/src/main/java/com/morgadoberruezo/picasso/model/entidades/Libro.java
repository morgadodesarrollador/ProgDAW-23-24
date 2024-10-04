package com.morgadoberruezo.picasso.model.entidades;

import jakarta.persistence.*;

import lombok.*;

//clase Libro --> Entidad Libro
@Entity
@Table(name="Libros")
@Setter
@Getter
public class Libro {

    @Id
    private String isbn;

    @Column(name="nombre", nullable=false)
    private String nombre;

    @Column(name="precio", nullable=false)
    private float precio;

    @Column(name="paginas", nullable=false)
    private int paginas;

    @Column(name="logo", nullable=true)
    private String imagen;
    
    public void getIsbn(){

    }

    public void setIsbn(String isbn){
        this.isbn = isbn;
    }
}
