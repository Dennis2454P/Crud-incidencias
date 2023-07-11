package com.app.web.servicio;

import com.app.web.entidad.Estudiante;
import com.app.web.repositorio.EstudianteRepositorio;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
class serviciorestTest {
    @Mock
    private EstudianteRepositorio repo;
    @InjectMocks
    private serviciorest serviciorest;
@BeforeEach
    void SetUp(){
        MockitoAnnotations.initMocks(this);
    }
   /* @Test
    void createEstudiante() {
        Estudiante estudiante = new Estudiante(1L, "John Doe");
        estudiante.setId(1L);
        estudiante.setNombre("John Doe");

        // Simular el comportamiento del repositorio
        when(repo.save(estudiante)).thenReturn(estudiante);

        // Llamar al método del servicio
        Estudiante resultado = serviciorest.createEstudiante(estudiante);

        // Verificar el resultado
        assertEquals(estudiante, resultado);

        // Verificar que se llamó al método save del repositorio
        verify(repo, times(1)).save(estudiante);

    }
    @Test
    void geTALLEstudiantes() {
        // Crear una lista de estudiantes de muestra
        List<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(new Estudiante(1L, "John Doe"));
        estudiantes.add(new Estudiante(2L, "Jane Smith"));

        // Simular el comportamiento del repositorio
        when(repo.findAll()).thenReturn(estudiantes);

        // Llamar al método del servicio
        List<Estudiante> resultado = serviciorest.geTALLEstudiantes();

        // Verificar el resultado
        assertEquals(estudiantes, resultado);

        // Verificar que se llamó al método findAll del repositorio
        verify(repo, times(1)).findAll();
    }
    @Test
    void deleteEstudiante() {
        // Definir el ID del estudiante a eliminar
        Long estudianteId = 1L;

        // Llamar al método del servicio
        serviciorest.deleteEstudiante(estudianteId);

        // Verificar que se llamó al método deleteById del repositorio con el ID correcto
        verify(repo, times(1)).deleteById(estudianteId);
    }*/
}