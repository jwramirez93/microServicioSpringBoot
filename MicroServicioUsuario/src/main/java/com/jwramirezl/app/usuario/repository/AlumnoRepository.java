package com.jwramirezl.app.usuario.repository;

import org.springframework.data.repository.CrudRepository;

import com.jwramirezl.app.common.alumno.entity.Alumno;


public interface AlumnoRepository extends CrudRepository<Alumno, Long> {}
