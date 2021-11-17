package com.apiptow.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PersonDTO {

	private Long id;
	private String name;
	private String cpf;
	private SkillDTO cargo;
	
}