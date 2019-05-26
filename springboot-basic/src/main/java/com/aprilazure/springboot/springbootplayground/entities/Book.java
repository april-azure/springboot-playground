package com.aprilazure.springboot.springbootplayground.entities;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Book implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	long id;
	String name;
	String author; 
}
