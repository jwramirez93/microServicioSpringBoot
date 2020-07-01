package com.jwramirezl.app.usuario.service;


import org.springframework.stereotype.Service;

import com.jwramirezl.app.common.alumno.entity.Alumno;
import com.jwramirezl.app.common.service.CommonServiceImpl;
import com.jwramirezl.app.usuario.repository.AlumnoRepository;

@Service
public class AlumnoServiceImpl extends CommonServiceImpl<Alumno, AlumnoRepository> implements AlumnoService{}
