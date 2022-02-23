package com.example.ProyectoEgg.repository.productoRepository;

import com.example.ProyectoEgg.models.producto.Categoria;
import com.example.ProyectoEgg.models.producto.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@Component
public interface ProductoRepository extends JpaRepository<Producto, Long> {

   List<Producto> findAllByCategoria(Categoria categoria);


}
