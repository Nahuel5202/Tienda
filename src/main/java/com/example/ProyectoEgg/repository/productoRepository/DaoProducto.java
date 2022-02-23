package com.example.ProyectoEgg.repository.productoRepository;

import com.example.ProyectoEgg.models.producto.Categoria;
import com.example.ProyectoEgg.models.producto.Producto;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DaoProducto  {
    private final ProductoRepository productoRepository;

    public DaoProducto(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    public List<Producto> obtenerProductos(){

        return productoRepository.findAll();
    }
    public List<Producto> obtenerProductosCategoria(Categoria categoria){


        return productoRepository.findAll();
    }
}
