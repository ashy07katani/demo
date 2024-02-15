package com.example.onetomany.demo.service;

import com.example.onetomany.demo.dto.AuthorDto;
import com.example.onetomany.demo.entity.AuthorEntity;
import com.example.onetomany.demo.entity.BookEntity;
import com.example.onetomany.demo.repository.AuthorRepository;
import com.example.onetomany.demo.repository.BookRepository;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class AuthorServiceImpl implements AuthorService {

	@Autowired
	AuthorRepository repository;
	@Autowired
	BookRepository bookRepository;
	
	@Override
	public String createAuthor(AuthorDto author) {
		// TODO Auto-generated method stub
		AuthorEntity authorEntity = new AuthorEntity();
		authorEntity.setName(author.getName());
		Set<BookEntity> books=new HashSet<>(); 
		authorEntity.setBooks(books);
		repository.save(authorEntity);
		return "author added";
		
	}
	
	public List<AuthorEntity> getAuthors()
	{
		
		return repository.findAll();
	}
	
	

}
