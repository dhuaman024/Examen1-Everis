package com.everisp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "estudiante")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Estudiante {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "nombres", nullable = false, length = 50)
	private String nombres;
	@Column(name = "apellidos", nullable = false, length = 50)
	private String apellidos;
	@Column(name = "dni", nullable = false, length = 8)
	private String dni;
	@Column(name = "edad",  nullable = false)
	private int edad;
	@Column(name = "estado", nullable = false)
	private int estado;

	@ManyToOne
	@JoinColumn(name = "id_curso", nullable = false)
	private Curso curso;
	
}
