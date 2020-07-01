package com.jwramirezl.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Alumno;


public interface AlumnoRepository extends CrudRepository<Alumno, Long> {}
