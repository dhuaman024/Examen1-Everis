package com.everisp.service;

import java.util.List;

import com.everisp.model.Estudiante;




public interface IEstudianteService {

	void registrar(Estudiante estudiante);
	void modificar(Estudiante estudiante);
	void eliminar(Integer id);
	List<Estudiante> listar();
	List<Estudiante> listarxEstado(int estado);

}
