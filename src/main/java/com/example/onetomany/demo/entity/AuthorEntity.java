package com.example.onetomany.demo.entity;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Author_details")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuthorEntity {

	@Column(name = "author_id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long authorId;
	@Column(name = "author_name")
	private String name;
	@OneToMany(mappedBy = "author",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private Set<BookEntity> books;
}
