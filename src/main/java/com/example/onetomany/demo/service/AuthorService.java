package com.example.onetomany.demo.service;

import java.util.List;

import com.example.onetomany.demo.dto.AuthorDto;
import com.example.onetomany.demo.entity.AuthorEntity;

public interface AuthorService {

	public String createAuthor(AuthorDto author);
	public List<AuthorEntity> getAuthors();
}
