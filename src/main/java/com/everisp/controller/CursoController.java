package com.everisp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everisp.model.Curso;
import com.everisp.service.ICursoService;


@RestController
@RequestMapping("/curso")
public class CursoController {

	@Autowired
	private ICursoService service;
	
	@PostMapping(value = "/registrar")
	public ResponseEntity<Integer> registrar(@RequestBody Curso curso) {
		int rpta = 0;
		try {
			service.registrar(curso);
			rpta = 1;
		} catch (Exception e) {
			return new ResponseEntity<Integer>(rpta, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<Integer>(rpta, HttpStatus.OK);
	}
	
	@PutMapping(value = "/actualizar")
	public ResponseEntity<Integer> actualizar(@RequestBody Curso curso) {
		int rpta = 0;
		try {
			service.modificar(curso);
			rpta = 1;		
		} catch (Exception e) {
			return new ResponseEntity<Integer>(rpta, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		return new ResponseEntity<Integer>(rpta, HttpStatus.OK);
	}
	
	@DeleteMapping(value = "/eliminar/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Integer> eliminar(@PathVariable Integer id) {
		int resultado = 0;
		try {
			service.eliminar(id);
			resultado = 1;
		} catch (Exception e) {
			resultado = 0;
		}

		return new ResponseEntity<Integer>(resultado, HttpStatus.OK);
	}
//	
	@GetMapping(value = "/listar", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Curso>> listar(){
		
		
		List<Curso> cursos = new ArrayList<>();
		try {
			cursos = service.listar();
		}catch(Exception e) {
			return new ResponseEntity<List<Curso>>(cursos, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<List<Curso>>(cursos, HttpStatus.OK);
	}
	
	@GetMapping(value = "/listarxestado/{estado}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Curso>> listarxEstado(@PathVariable Integer estado){
		
		List<Curso> cursos = new ArrayList<>();
		try {
			cursos = service.listarxEstado(estado);//ingresar 0  o 1
		}catch(Exception e) {
			return new ResponseEntity<List<Curso>>(cursos, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<List<Curso>>(cursos, HttpStatus.OK);
	}
	

	
	
	

}
