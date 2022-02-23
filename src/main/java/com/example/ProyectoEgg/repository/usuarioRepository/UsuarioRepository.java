package com.example.ProyectoEgg.repository.usuarioRepository;

import com.example.ProyectoEgg.models.Usuario.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
