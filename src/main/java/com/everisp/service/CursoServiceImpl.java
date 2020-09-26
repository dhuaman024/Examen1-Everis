package com.everisp.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everisp.dao.ICursoDAO;
import com.everisp.model.Curso;



@Service
public class CursoServiceImpl implements ICursoService {
	
	@Autowired
	private ICursoDAO dao;

	
	@Override
	public void registrar(Curso curso) {
		dao.save(curso);
		
	}

	@Override
	public void modificar(Curso curso) {
		dao.save(curso);
		
	}

	@Override
	public void eliminar(Integer id) {
		dao.deleteById(id);
		
	}

	@Override
	public List<Curso> listar() {
		return dao.findAll();
	}

	@Override
	public List<Curso> listarxEstado(int estado) {
		List<Curso> listcurso;
		listcurso = dao.findAll().stream().filter(p -> p.getEstado()==estado).collect(Collectors.toList());
		return listcurso;

	}

}
