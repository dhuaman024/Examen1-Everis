package com.everisp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.everisp.model.Estudiante;

@Repository
public interface IEstudianteDAO extends JpaRepository<Estudiante, Integer>{

}
