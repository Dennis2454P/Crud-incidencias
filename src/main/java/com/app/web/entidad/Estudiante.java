package com.app.web.entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "estudiantes")
public class Estudiante {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "apellido")
	private String solucion;
	
	@Column(name = "email")
	private String reportado;
	@Column(name = "titulo")
	private String titulo;

	@Column(name = "severidad")
	private String severidad;

	//public Estudiante(long l, String s) {}

	public Estudiante(){

	}
	public Estudiante(Long id, String nombre,String solucion, String reportado, String titulo, String severidad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.solucion = solucion;
		this.reportado = reportado;
		this.titulo = titulo;
		this.severidad = severidad;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getSolucion() {
		return solucion;
	}

	public void setReportado(String apellido) {
		this.solucion = apellido;
	}

	public String getReportado() {
		return reportado;
	}

	public void setSolucion(String email) {
		this.reportado = email;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getSeveridad() {
		return severidad;
	}

	public void setSeveridad(String severidad) {
		this.severidad = severidad;
	}

	@Override
	public String toString() {
		return "Estudiante[" +
				"id=" + id +
				", nombre='" + nombre + '\'' +
			//	", solucion='" + solucion + '\'' +
			//	", reportado='" + reportado + '\'' +
				", titulo='" + titulo + '\'' +
				", severidad='" + severidad + '\'' +
				']';
	}


	
	
}
