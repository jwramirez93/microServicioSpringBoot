package com.jwramirezl.app.service;

import org.springframework.stereotype.Service;

import com.jwramirezl.app.entity.Curso;
import com.jwramirezl.app.repository.CursoRepository;

@Service
public class CursoServiceImpl extends CommonServiceImpl<Curso, CursoRepository> implements CursoService {}
