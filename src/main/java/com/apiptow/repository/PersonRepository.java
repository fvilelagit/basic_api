package com.apiptow.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apiptow.entity.Person;

public interface PersonRepository extends JpaRepository <Person,Long>{

	
	
}
