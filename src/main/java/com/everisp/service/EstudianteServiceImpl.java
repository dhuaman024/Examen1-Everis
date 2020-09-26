package com.everisp.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everisp.dao.IEstudianteDAO;
import com.everisp.model.Estudiante;



@Service
public class EstudianteServiceImpl implements IEstudianteService{

	@Autowired
	private IEstudianteDAO dao;

	@Override
	public void registrar(Estudiante estudiante) {
		dao.save(estudiante);
		
	}

	@Override
	public void modificar(Estudiante estudiante) {
		dao.save(estudiante);
		
	}

	@Override
	public void eliminar(Integer id) {
		dao.deleteById(id);
		
	}

	@Override
	public List<Estudiante> listar() {
		return dao.findAll();
	}

	

	@Override
	public List<Estudiante> listarxEstado(int estado) {
		
		List<Estudiante> listEstudiante;
		listEstudiante = dao.findAll().stream().filter(p -> p.getEstado()==estado).collect(Collectors.toList());
		return listEstudiante;
	}
	
	
	
	
	
	
	
	
	
	
//	
//	@Override
//	public void registrar(Persona persona) {
//		dao.save(persona);
//	}
//
//	@Override
//	public void modificar(Persona persona) {
//		dao.save(persona);
//	}
//
//	@Override
//	public void eliminar(Integer id) {
//		dao.deleteById(id);
//	}
//
//	@Override
//	public List<Persona> listar() {
//		/*List<Persona> lista = new ArrayList<>();
//		lista.add(new Persona(1, "yo", "apellido", "72485968",27));
//		lista.add(new Persona(2, "dani", "apellido2", "72485968",22));
//		lista.add(new Persona(3, "dani", "apellido3", "72485968",22));
//		return lista;*/
//		return dao.findAll();
//	}
//
//	@Override
//	public Persona listarId(Integer id) {		
//		return dao.getOne(id);
//	}

}
