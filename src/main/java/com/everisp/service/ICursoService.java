package com.everisp.service;

import java.util.List;

import com.everisp.model.Curso;




public interface ICursoService {
	
	void registrar(Curso curso);
	void modificar(Curso curso);
	void eliminar(Integer id);
	List<Curso> listar();
	List<Curso> listarxEstado(int estado);
	
}
