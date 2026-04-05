package com.drover.demo.backend.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.drover.demo.backend.entity.Comision;
import com.drover.demo.backend.service.ComisionService;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/comisiones")
public class ComisionController {

    private final ComisionService service;

    public ComisionController(ComisionService service){
        this.service = service;
    }

    @PostMapping
    public Comision crear(@RequestBody Comision c){
        return service.guardar(c);
    }

    @GetMapping
    public List<Comision> listar(){
        return service.listar();
    }

    @GetMapping("/usuario")
    public List<Comision> obtenerPorUsuario(@RequestParam Integer usuarioId) {
        return service.obtenerPorUsuario(usuarioId);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        service.eliminar(id);
    }
}
