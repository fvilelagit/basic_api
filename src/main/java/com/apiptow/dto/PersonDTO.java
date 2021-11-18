package com.apiptow.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PersonDTO {

	private Long id;
	private String name;
	private String cpf;
	
	private SkillDTO cargo;
	
}