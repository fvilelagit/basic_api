package com.apiptow.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.apiptow.dto.PersonDTO;
import com.apiptow.entity.Person;

@Mapper
public interface PersonMapper {

    PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

    @Mapping(target = "cargo", source = "cargo")
	static Person toModel(PersonDTO personDTO) {
		// TODO Auto-generated method stub
		return null;
	}

    static PersonDTO toDTO(Person person) {
		// TODO Auto-generated method stub
		return null;
	}
}