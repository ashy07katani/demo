package com.example.onetomany.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.onetomany.demo.entity.AuthorEntity;
import com.example.onetomany.demo.entity.BookEntity;

public interface BookRepository extends JpaRepository<BookEntity, Long>{

}
