package com.jwramirezl.app.service;


import org.springframework.stereotype.Service;

import com.example.demo.entity.Alumno;
import com.jwramirezl.app.repository.AlumnoRepository;

@Service
public class AlumnoServiceImpl extends CommonServiceImpl<Alumno, AlumnoRepository> implements AlumnoService{}
