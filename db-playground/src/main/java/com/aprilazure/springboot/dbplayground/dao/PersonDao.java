package com.aprilazure.springboot.dbplayground.dao;

import java.util.List;
import java.util.UUID;

import com.aprilazure.springboot.dbplayground.entities.Person;

public interface PersonDao {
	List<Person> findAll();
	
	Person findById(UUID id);
	
	int deleteById(UUID id); 
	
	int insert(Person person);
	
	int update(Person person);
}
