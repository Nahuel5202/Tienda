package com.example.ProyectoEgg.models.Usuario;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Getter
    private Long id;

    @Getter @Setter
    private String nombre;

    @Getter @Setter
    private String email;

    @Getter @Setter
    private String contraseña;

    @Getter @Setter
    private String telefono;

}
