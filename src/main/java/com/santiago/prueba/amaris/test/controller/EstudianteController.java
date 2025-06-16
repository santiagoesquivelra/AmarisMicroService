package com.santiago.prueba.amaris.test.controller;

import com.santiago.prueba.amaris.test.model.Estudiante;
import com.santiago.prueba.amaris.test.service.EstudianteService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import java.util.List;

@RestController
@RequestMapping("/api/estudiantes")
public class EstudianteController {

    @Autowired
    private EstudianteService service;

    @GetMapping
    public List<Estudiante> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Estudiante getById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    public Estudiante create(@RequestBody Estudiante estudiante) {
        return service.save(estudiante);
    }

    @PutMapping("/{id}")
    public Estudiante update(@PathVariable Long id, @RequestBody Estudiante estudiante) {
        return service.update(id, estudiante);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}