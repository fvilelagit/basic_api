package com.apiptow.config;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Profile;

import com.apiptow.entity.Person;
import com.apiptow.entity.Skill;
import com.apiptow.repository.PersonRepository;
import com.apiptow.repository.SkillRepository;


@Configuration
//@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private SkillRepository skillRepository;
	@Autowired
	private PersonRepository personRepository;
	

	@Override
	public void run(String... args) throws Exception {
		
		Skill s1= new Skill(null,"jogador",10000.00,new ArrayList<Person>());

		skillRepository.save(s1);

		Person p1 = new Person(null, "Billy", "999.999.000",s1);

		personRepository.save(p1);
		
	}
	
}
