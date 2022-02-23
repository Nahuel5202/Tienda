package com.example.ProyectoEgg.service;

import com.example.ProyectoEgg.models.Usuario.Usuario;
import com.example.ProyectoEgg.repository.usuarioRepository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;


    public void guardarUsuario(String nombre, String email, String clave, String telefono){

        Usuario usuario = new Usuario();
        usuario.setNombre(nombre);
        usuario.setEmail(email);
        usuario.setContraseña(clave);
        usuario.setTelefono(telefono);
        usuarioRepository.save(usuario);
    }
}
