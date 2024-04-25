package com.morgadoberruezo.picasso.model.entidades;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Clientes")
@Setter
@Getter
public class Editores {
   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
   
    @Column(name = "nombre", nullable = false)
    @NonNull private String nombre;

}
