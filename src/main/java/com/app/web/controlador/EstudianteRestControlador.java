package com.app.web.controlador;

import com.app.web.entidad.Estudiante;
import com.app.web.repositorio.EstudianteRepositorio;
import com.app.web.servicio.EstudianteServicio;
import com.app.web.servicio.serviciorest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/rest")
public class EstudianteRestControlador {

	@Autowired
	private serviciorest service;


	@PostMapping
	public Estudiante crear(@RequestBody Estudiante estudiante){
		return service.createEstudiante(estudiante);
	}

	@GetMapping("/traer")
	public List<Estudiante> getAllEstudiante(){
		return service.geTALLEstudiantes();
	}

	@DeleteMapping("{id}")
	public void deleteEstudianerById(@PathVariable("id") Long id){
		service.deleteEstudiante(id);

	}
}
