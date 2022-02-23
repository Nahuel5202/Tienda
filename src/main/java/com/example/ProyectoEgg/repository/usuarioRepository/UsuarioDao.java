package com.example.ProyectoEgg.repository.usuarioRepository;

import com.example.ProyectoEgg.models.Usuario.Usuario;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioDao {
    private final UsuarioRepository usuarioRepository;

    public UsuarioDao(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public List<Usuario> obtenerUsuarios(){
        return usuarioRepository.findAll();
    }
}
