package com.example.onetomany.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.onetomany.demo.dto.BookDto;
import com.example.onetomany.demo.entity.AuthorEntity;
import com.example.onetomany.demo.entity.BookEntity;
import com.example.onetomany.demo.repository.AuthorRepository;
import com.example.onetomany.demo.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	BookRepository bookRepository;
	
	@Autowired
	AuthorRepository authorRepository;
	@Override
	public String createBook(BookDto book) {
		// TODO Auto-generated method stub
		BookEntity bookEntity = new BookEntity();
		book.getAuthor();
		AuthorEntity author  = authorRepository.findById(book.getAuthor()).get();
		bookEntity.setAuthor(author);
		bookEntity.setName(book.getName());
		bookRepository.save(bookEntity);
		return "Book "+ book.getName()+" added";
	}
	
	public List<BookDto> getBooks()
	{
		List<BookDto> books = new ArrayList<BookDto>();
		List<BookEntity> bookEntity = bookRepository.findAll();
		bookEntity.stream().forEach((x)->{
			BookDto book = new BookDto(x.getName(), x.getAuthor().getAuthorId());
			books.add(book);
		});
		return books;
	}

}
