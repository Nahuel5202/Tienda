package com.example.ProyectoEgg.controller;


import com.example.ProyectoEgg.repository.usuarioRepository.UsuarioRepository;
import com.example.ProyectoEgg.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/api")
public class usuarioController {



    private final UsuarioRepository usuarioRepository;

    @Autowired
    public usuarioController(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

@Autowired public UsuarioService usuarioService;



    @GetMapping("/login")
    public String login(@RequestParam(required = false)String error, ModelMap model){
        if (error != null) {
            model.put("error","nombre de usuario o contraseña incorrecta");

        }
        return "/inicio";
    }

    @GetMapping("/registro")
    public String registro(){
        return "/registro";
    }

    @PostMapping("/registrar")
    public String registrar(@RequestParam String nombre, @RequestParam String email,@RequestParam String clave,
                            @RequestParam String telefono){


        usuarioService.guardarUsuario(nombre,email,clave,telefono);
        return "/registro";
    }

}
