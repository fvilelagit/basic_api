package com.apiptow.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SkillDTO {

	private Long id;

	private String name;
	private Double salary;
    private List<PersonDTO> peoples;
	
	
	
}
