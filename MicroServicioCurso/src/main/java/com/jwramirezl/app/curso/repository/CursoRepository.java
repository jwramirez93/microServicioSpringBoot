package com.jwramirezl.app.curso.repository;

import org.springframework.data.repository.CrudRepository;

import com.jwramirezl.app.curso.entity.Curso;

public interface CursoRepository extends CrudRepository<Curso, Long>  {}
