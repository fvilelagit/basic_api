package com.apiptow.controller;

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
	
	@PostMapping
	public ResponseEntity <Response<PersonDTO>> insertJogador(@Valid @RequestBody PersonDTO dto, BindingResult r){
		
		Response <PersonDTO> response = new Response<PersonDTO>();
		
		if (r.hasErrors()) {
			r.getAllErrors().forEach(e -> response.getErrors().add(e.getDefaultMessage()));
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
		}	
		
		Person j = service.save(PersonMapper.toModel(dto));
		response.setData(PersonMapper.toDTO(j));
		return ResponseEntity.status(HttpStatus.CREATED).body(response);
		
	}
	
	@GetMapping
	public String getBook() {
		return "API TEST"; 
	}
	
	
	
}
