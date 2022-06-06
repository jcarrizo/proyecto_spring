package com.carrizo.practica.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.carrizo.practica.modelo.Producto;
import com.carrizo.practica.modelo.ProductoRepositorio;
import java.util.List;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class ProductoController {

    private final ProductoRepositorio productoRepositorio;


    @GetMapping("/producto")
    public List<Producto> obtenerTodos(){
        return null;
    }

    @GetMapping("/producto/{id}")
    public List<Producto> obtenerUno(@PathVariable Long id){
        return null;
    }

    @PostMapping("/producto")   
    public Producto nuevoProducto(@RequestBody Producto nuevo){
        return null;
    }

    @PutMapping("/producto/{id}")
    public Producto editarProducto(@RequestBody Producto editar, @PathVariable Long id){
        return null;
    }

    @DeleteMapping("/producto/{id}")
    public Producto borrarProducto(@PathVariable Long id){
        return null;
    }
}
