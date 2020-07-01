package com.jwramirezl.app.curso.service;

import org.springframework.stereotype.Service;

import com.jwramirezl.app.common.service.CommonServiceImpl;
import com.jwramirezl.app.curso.entity.Curso;
import com.jwramirezl.app.curso.repository.CursoRepository;

@Service
public class CursoServiceImpl extends CommonServiceImpl<Curso, CursoRepository> implements CursoService {}
