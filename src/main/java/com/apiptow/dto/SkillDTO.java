package com.apiptow.dto;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.OneToMany;

import com.apiptow.entity.Person;

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
	private BigDecimal salary;
    private List<PersonDTO> peoples;
	
	
	
}
