package com.example.onetomany.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.onetomany.demo.dto.BookDto;
import com.example.onetomany.demo.service.BookService;

@RestController
@RequestMapping("/api")
public class BookController {
	
	@Autowired
	BookService service;
	@GetMapping("/book")
	public List<BookDto> getBooks()
	{
		return service.getBooks();
		
	}

	@PostMapping("/book")
	public String createBook(@RequestBody BookDto book)
	{
		System.out.println(book);
		
		return service.createBook(book);
	}

}
