package com.app.web.servicio;

import com.app.web.entidad.Estudiante;
import com.app.web.repositorio.EstudianteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class serviciorest {
     @Autowired
    private EstudianteRepositorio repo;
    public Estudiante createEstudiante(Estudiante estudent){
        return  repo.save(estudent);
    }

    public List<Estudiante> geTALLEstudiantes(){
        return repo.findAll();
    }
    public void deleteEstudiante(Long id){
        repo.deleteById(id);
    }
}
