package com.apiptow.service;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.apiptow.entity.Person;
import com.apiptow.repository.PersonRepository;


@Service
public class PersonService {

	@Autowired
	private PersonRepository repository;
	
	public Person save(Person person) {
		return repository.save(person);
		
	}

	public List<Person> findAll() {
		return repository.findAll();
	}

}
