package com.jwramirezl.app.entity;

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

import com.example.demo.entity.Alumno;

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

	public Curso() {}

	public Curso(Long id, String nombre, Date creataAt) {
		this.id = id;
		this.nombre = nombre;
		this.creataAt = creataAt;
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

}
