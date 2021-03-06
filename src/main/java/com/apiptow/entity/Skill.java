package com.apiptow.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Skill implements Serializable{

	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;

	private Double salary;
	
    @OneToMany(mappedBy = "cargo")
    private List<Person> peoples;

	public Skill(Long id, String name, Double salary, List<Person> peoples) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.peoples = peoples;
	}
	
	

}
