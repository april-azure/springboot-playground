package com.aprilazure.springboot.dbplayground.dao;

import java.sql.Timestamp;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.aprilazure.springboot.dbplayground.entities.Person;

@Repository
public class PersonDaoJdbcImpl implements PersonDao{
	/*
	 * auto configured
	 * 
	 */
	@Autowired
	JdbcTemplate jdbc;

	/*
	 * Define your own rowmapper impl if necessary 
	 */
	
	@Override
	public List<Person> findAll() {
		List<Person> ppls = jdbc.query("select * from person", 
				new BeanPropertyRowMapper(Person.class));
		return ppls;
	}

	@Override
	public Person findById(UUID id) {
		return jdbc.queryForObject("select * from person where id = ?", 
				new Object[] {id},
				new BeanPropertyRowMapper<Person>(Person.class));
	} 
	
	@Override
	public int deleteById(UUID id) {
		String sql = "delete from person where id = ?"; 
		Object[] ids = new Object[] {id.toString()};
		return jdbc.update(sql, ids);
	}
	
	@Override
	public int insert(Person person) {
		String sql = "insert into person values(?,?,?)"; 
		
		return jdbc.update(sql, new Object[] {
			person.getId(),
			person.getName(), 
			new Timestamp(person.getBirthDate().getTime())
		});
	}
	
	public int update(Person person) {
		String sql = "update person " 
				+ "set name = ?, " 
				+ "birth_date = ? " 
				+ "where id = ?";
		Object[] args = new Object[] {
			person.getName(), 
			person.getBirthDate(), 
			person.getId()
		};
		
		return jdbc.update(sql, args);
	}
}
