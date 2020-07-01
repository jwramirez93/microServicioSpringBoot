package com.jwramirezl.app.curso.controller;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jwramirezl.app.common.controller.CommonController;
import com.jwramirezl.app.curso.entity.Curso;
import com.jwramirezl.app.curso.service.CursoService;

@RestController
public class CursoController extends CommonController<Curso, CursoService> {
	
	@PutMapping("/{id}")
	public ResponseEntity<?> editar(@RequestBody Curso curso, @PathVariable Long id){
		
		Optional<Curso> o = service.findById(id);
		
		if(o.isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		
		Curso cursoDB = o.get();
		
		
		return ResponseEntity.status(HttpStatus.CREATED).body(service.save(cursoDB));
	}
	
}
