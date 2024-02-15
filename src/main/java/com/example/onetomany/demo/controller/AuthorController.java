package com.example.onetomany.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.onetomany.demo.dto.AuthorDto;
import com.example.onetomany.demo.entity.AuthorEntity;
import com.example.onetomany.demo.service.AuthorService;

@RestController
@RequestMapping("/api")
public class AuthorController {
	
	@Autowired
	AuthorService service;
	@GetMapping("/author")
	public List<AuthorEntity> getAuthors()
	{
		return service.getAuthors();
	}
	@PostMapping("/author")
	public String createAuthor(@RequestBody AuthorDto author)
	{
		return  service.createAuthor(author);
	}

}
