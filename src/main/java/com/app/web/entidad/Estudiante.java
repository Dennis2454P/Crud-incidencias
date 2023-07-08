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
	
	@Column(name = "nombre",nullable = false,length = 50)
	private String nombre;
	
	@Column(name = "apellido",nullable = false,length = 50)
	private String apellido;
	
	@Column(name = "email",nullable = false,length = 50)
	private String email;
	@Column(name = "titulo",nullable = false,length = 50)
	private String titulo;

	@Column(name = "severidad",nullable = false,length = 50)
	private String severidad;

	public Estudiante() {
		
	}

	public Estudiante(Long id, String nombre, String apellido, String email, String titulo, String severidad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.titulo = titulo;
		this.severidad = severidad;
	}

	public Estudiante(Long id, String nombre, String apellido, String email) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
	}
	
	public Estudiante( String nombre, String apellido, String email, String titulo, String severidad) {
		super();
		this.titulo=titulo;
		this.severidad=severidad;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
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

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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
				", apellido='" + apellido + '\'' +
				", email='" + email + '\'' +
				", titulo='" + titulo + '\'' +
				", severidad='" + severidad + '\'' +
				']';
	}


	
	
}
