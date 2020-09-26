package com.everisp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.everisp.model.Curso;




@Repository
public interface ICursoDAO extends JpaRepository<Curso, Integer> {

}
