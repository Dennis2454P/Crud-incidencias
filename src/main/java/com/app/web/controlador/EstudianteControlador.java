package com.app.web.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.app.web.entidad.Estudiante;
import com.app.web.servicio.EstudianteServicio;

@Controller
public class EstudianteControlador {

	@Autowired
	private EstudianteServicio servicio;



//apartado inicio donde se muestra toda la lista de estudiantes retorna a la plantilla
	@GetMapping({ "/estudiantes"})
	public String listarEstudiantes(Model modelo) {
		modelo.addAttribute("estudiantes", servicio.listarTodosLosEstudiantes());
		return "estudiantes"; // nos retorna al archivo estudiantes
	}
	//metodo para acceder al boton agregar estudiantes
	@GetMapping("/estudiantes/nuevo")
	public String mostrarFormularioDeRegistrtarEstudiante(Model modelo) {
		Estudiante estudiante = new Estudiante();
		modelo.addAttribute("estudiante", estudiante);
		return "crear_estudiante";
	}

	//boton guardar estudiante y redirecciona a la tabla
	@PostMapping("/estudiantes")
	public String guardarEstudiante(@ModelAttribute("estudiante") Estudiante estudiante) {

     try{servicio.guardarEstudiante(estudiante);
		 return "redirect:/estudiantes";}
	 catch(Exception e){ return "redirect:/error";}

	}



	@GetMapping("/estudiantes/editar/{id}")
	public String mostrarFormularioDeEditar(@PathVariable Long id, Model modelo) {
		modelo.addAttribute("estudiante", servicio.obtenerEstudiantePorId(id));
		return "editar_estudiante";
	}

	@PostMapping("/estudiantes/{id}")
	public String actualizarEstudiante(@PathVariable Long id, @ModelAttribute("estudiante") Estudiante estudiante,
			Model modelo) {
		Estudiante estudianteExistente = servicio.obtenerEstudiantePorId(id);
		estudianteExistente.setId(estudiante.getId());
		estudianteExistente.setTitulo(estudiante.getTitulo());
		estudianteExistente.setSeveridad(estudiante.getSeveridad());
		estudianteExistente.setNombre(estudiante.getNombre());
		estudianteExistente.setSolucion(estudiante.getSolucion());
		estudianteExistente.setReportado (estudiante.getReportado());

		servicio.actualizarEstudiante(estudianteExistente);
		return "redirect:/estudiantes";
	}

	@GetMapping("/estudiantes/{id}")
	public String eliminarEstudiante(@PathVariable Long id) {
		servicio.eliminarEstudiante(id);
		return "redirect:/estudiantes";
	}
}
