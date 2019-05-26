package com.aprilazure.springboot.springbootplayground.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aprilazure.springboot.springbootplayground.entities.Book;

@RestController
public class BookController {
	
	@GetMapping("/books")
	public List<Book> getAllBooks(){
		return Arrays.asList(new Book(1l, "book name 2", "book author")); 
	}
}
