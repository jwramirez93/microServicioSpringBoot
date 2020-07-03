package com.jwramirezl.app.curso.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jwramirezl.app.common.alumno.entity.Alumno;
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
		cursoDB.setNombre(curso.getNombre());
		
		return ResponseEntity.status(HttpStatus.CREATED).body(service.save(cursoDB));
	}
	
	@PutMapping("/{id}/asignar-alumnos")
	public ResponseEntity<?> asignarAlumnos(@RequestBody List<Alumno> listaAlumnos, @PathVariable Long id){
		
		Optional<Curso> o = service.findById(id);
		
		if(o.isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		
		Curso cursoDB = o.get();
		
		listaAlumnos.forEach(alumno -> {
			cursoDB.addAlumno(alumno);
		});
		
		return ResponseEntity.status(HttpStatus.CREATED).body(service.save(cursoDB));
	}
	
	@DeleteMapping("/{id}/remover-alumno")
	public ResponseEntity<?> removerAlumno(@RequestBody Alumno alumno, @PathVariable Long id){
		
		Optional<Curso> o = service.findById(id);
		
		if(o.isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		
		Curso cursoDB = o.get();
		
		cursoDB.removeAlumno(alumno);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(service.save(cursoDB));
	}
	
}
