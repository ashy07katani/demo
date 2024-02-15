package com.example.onetomany.demo.service;

import java.util.List;

import com.example.onetomany.demo.dto.BookDto;

public interface BookService {
	
	public String createBook(BookDto book);
	public List<BookDto> getBooks();

}
