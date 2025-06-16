package com.santiago.prueba.amaris.test.mapper;
import com.santiago.prueba.amaris.test.dto.EstudianteDTO;
import com.santiago.prueba.amaris.test.model.Estudiante;

public class EstudianteMapper {

    public static Estudiante toEntity(EstudianteDTO dto) {
        Estudiante e = new Estudiante();
        e.setEid(dto.getEid());
        e.setNombre(dto.getNombre());
        e.setEspecialidad(dto.getEspecialidad());
        e.setGrado(dto.getGrado());
        return e;
    }   

    public static EstudianteDTO toDTO(Estudiante entity) {
        EstudianteDTO dto = new EstudianteDTO();
        dto.setEid(entity.getEid());
        dto.setNombre(entity.getNombre());
        dto.setEspecialidad(entity.getEspecialidad());
        dto.setGrado(entity.getGrado());
        return dto;
    }
}