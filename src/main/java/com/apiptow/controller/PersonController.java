package com.apiptow.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apiptow.dto.PersonDTO;
import com.apiptow.entity.Person;
import com.apiptow.mapper.PersonMapper;
import com.apiptow.response.Response;
import com.apiptow.service.PersonService;

@RestController
@RequestMapping("/api/person")
public class PersonController {
	
	@Autowired
	private PersonService service;
	@Autowired
	private final PersonMapper personMapper = PersonMapper.INSTANCE;
	
	
	@PostMapping
	public ResponseEntity <Response<PersonDTO>> insert(@RequestBody PersonDTO dto){
		
		Response <PersonDTO> response = new Response<PersonDTO>();
		
		Person j = service.save(personMapper.toModel(dto));
		response.setData(personMapper.toDTO(j));
		return ResponseEntity.status(HttpStatus.CREATED).body(response);
		
	}	
	
	@GetMapping
	public ResponseEntity<List<Response<PersonDTO>>> findAll(@RequestBody PersonDTO dto){
		List <Response<PersonDTO>> response = new ArrayList();
		
		List<PersonDTO> dtoList = service.findAll()
				.stream()
				.map(personMapper::toDTO)
				.collect(Collectors.toList());
		for (PersonDTO jdto : dtoList) {
			Response<PersonDTO> d1 = new Response<PersonDTO>();
			d1.setData(jdto);
			response.add(d1);
		}
		
		return ResponseEntity.ok().body(response);
		
	}
	
	
	
}
