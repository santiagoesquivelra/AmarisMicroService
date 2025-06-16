package com.santiago.prueba.amaris.test.service;

import com.santiago.prueba.amaris.test.model.Estudiante;
import com.santiago.prueba.amaris.test.repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstudianteServiceImpl implements EstudianteService {

    @Autowired
    public EstudianteRepository repository;

    @Override
    public List<Estudiante> findAll() {
        return repository.findAll();
    }

    @Override
    public Estudiante findById(Long id) {
        Optional<Estudiante> estudiante = repository.findById(id);
        return estudiante.orElse(null);
    }

    @Override
    public Estudiante save(Estudiante estudiante) {
        return repository.save(estudiante);
    }

    @Override
    public Estudiante update(Long id, Estudiante estudiante) {
        if (repository.existsById(id)) {
            estudiante.setEid(id);
            return repository.save(estudiante);
        }
        return null;
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
