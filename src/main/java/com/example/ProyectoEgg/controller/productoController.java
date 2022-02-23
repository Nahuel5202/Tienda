package com.example.ProyectoEgg.controller;

import com.example.ProyectoEgg.models.producto.Categoria;
import com.example.ProyectoEgg.models.producto.Producto;
import com.example.ProyectoEgg.repository.productoRepository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import java.util.Optional;


import static com.example.ProyectoEgg.models.producto.Categoria.BELLEZA;
import static com.example.ProyectoEgg.models.producto.Marca.COLGATE;
import static com.example.ProyectoEgg.models.producto.Categoria.BEBES;






@Controller
@RequestMapping("/api")
public class productoController {


    private final ProductoRepository productoRepository;

    @Autowired
    public productoController(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }



@GetMapping("/prueba")
public String pueba(){


        return"/prueba";
}


    @GetMapping("/productos/{categoria}")
    public String obtenerProductos(@PathVariable("categoria") Categoria categoria,Model model) {


        model.addAttribute("product",productoRepository.findAllByCategoria(categoria));

      return "allProductos";

    }

    @PostMapping("/producto")
    public String crearProducto(@RequestBody Producto producto) {
        producto.setCategoria(BEBES);
        producto.setMarca(COLGATE);

        productoRepository.save(producto);
        return "Producto creado";
    }

    @DeleteMapping("/producto/{id}")
    public String eliminarProducto(@PathVariable("id") Long id) {
        Optional<Producto> producto = productoRepository.findById(id);
        if (producto.isPresent()) {
            productoRepository.deleteById(id);
            return "Producto encontrado y borrado";
        } else {
            return "Producto no encontrado";
        }
    }

}