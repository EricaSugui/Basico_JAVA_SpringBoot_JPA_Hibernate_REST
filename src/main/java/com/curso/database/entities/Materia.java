package com.curso.database.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

@Entity
public class Materia {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(nullable = false)
	private String nome;
	
	@ManyToMany
	@JoinTable(
			name = "grade_materia",
			joinColumns = {
					@JoinColumn(name = "materia_id", referencedColumnName = "id")
			},
			inverseJoinColumns = {
					@JoinColumn(name = "grade_id", referencedColumnName = "id")
			}
		)
	private Set<GradeCurricular> grades = new HashSet<>();
}
