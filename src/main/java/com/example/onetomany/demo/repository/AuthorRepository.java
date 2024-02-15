package com.example.onetomany.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.onetomany.demo.entity.AuthorEntity;

public interface AuthorRepository extends JpaRepository<AuthorEntity, Long> {

}
