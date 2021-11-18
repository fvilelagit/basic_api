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
	Person toModel(PersonDTO personDTO);

    PersonDTO toDTO(Person person);
}