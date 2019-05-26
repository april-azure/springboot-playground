package com.aprilazure.springboot.dbplayground;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.aprilazure.springboot.dbplayground.dao.PersonDao;
import com.aprilazure.springboot.dbplayground.entities.Person;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class DbPlaygroundApplication implements CommandLineRunner{

	@Autowired
	PersonDao personDao;
	
	public static void main(String[] args) {
		SpringApplication.run(DbPlaygroundApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info(personDao.findAll().toString());
		log.info(personDao
				.findById(UUID.fromString("c2fa7058-cc3f-4707-b96b-2b4400df7253"))
				.toString());
		log.info(String.valueOf(personDao
				.deleteById(UUID.fromString("c2fa7058-cc3f-4707-b96b-2b4400df7253"))));
		
		Person p = Person.builder()
				.id(UUID.randomUUID())
				.name("testname")
				.birthDate(Timestamp.from(Instant.now()))
				.build();
		personDao.update(p); 
	}
}
