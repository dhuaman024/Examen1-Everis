package com.everisp.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "curso")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Curso {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "nombre", nullable = false, length = 50)
	private String nombres;
	@Column(name = "profesor", nullable = false, length = 50)
	private String profesor;
	@Column(name = "estado", nullable = false)
	private int estado;
	
//	@JsonFormat(pattern = "yyyy-MM-dd") 
//	@Column(name = "fecha_expiracion" )
//	private Date fechaExpiracion;

}
