package com.santiago.prueba.amaris.test.service;

import com.santiago.prueba.amaris.test.model.Estudiante;
import java.util.List;

public interface EstudianteService {
    List<Estudiante> findAll();
    Estudiante findById(Long id);
    Estudiante save(Estudiante estudiante);
    Estudiante update(Long id, Estudiante estudiante);
    void delete(Long id);
}