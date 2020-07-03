package com.jwramirezl.app.curso.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.jwramirezl.app.common.alumno.entity.Alumno;

@Entity
@Table(name = "tbl_curso")
public class Curso {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "num_id_curso")
	private Long id;

	@Column(name = "str_nombre")
	private String nombre;

	@Column(name = "date_createAt")
	@Temporal(TemporalType.TIMESTAMP)
	private Date creataAt;
	
	@PrePersist
	public void prePersist() {
		this.creataAt = new Date();
	}
	
	@OneToMany(fetch = FetchType.LAZY)
	private List<Alumno> listaAlumnos;

	public Curso() {
		this.listaAlumnos = new ArrayList<>();
	}

	public Curso(Long id, String nombre, Date creataAt) {
		this.id = id;
		this.nombre = nombre;
		this.creataAt = creataAt;
		this.listaAlumnos = new ArrayList<>();
	}
	
	public List<Alumno> getListaAlumnos() {
		return listaAlumnos;
	}

	public void setListaAlumnos(List<Alumno> listaAlumnos) {
		this.listaAlumnos = listaAlumnos;
	}
	
	public void addAlumno(Alumno alumno) {
		this.listaAlumnos.add(alumno);
	}
	
	public void removeAlumno(Alumno alumno) {
		this.listaAlumnos.remove(alumno);
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

	public Date getCreataAt() {
		return creataAt;
	}

	public void setCreataAt(Date creataAt) {
		this.creataAt = creataAt;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Curso other = (Curso) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	
	
}
