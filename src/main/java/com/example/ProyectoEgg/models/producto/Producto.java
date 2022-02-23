package com.example.ProyectoEgg.models.producto;

import com.example.ProyectoEgg.models.producto.Marca;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


import java.io.InputStream;

import static javax.persistence.EnumType.STRING;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private Long id;

    @Getter @Setter
    private String nombre;

    @Getter @Setter
    private Double precio;

    @Getter @Setter
    private String tamanio;

    @Getter @Setter
    private String imagen;

    @Getter @Setter
    @Enumerated(STRING)
    private Categoria categoria;

    @Getter @Setter
    @Enumerated(STRING)
    private Marca marca;


}
