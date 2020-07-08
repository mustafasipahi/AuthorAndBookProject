package com.aabp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.aabp.model.Author;

@Service
public interface AuthorService {

	public void save(Author author);
	public void update(Author author, Long id);
	public void delete(int id);
	public Author findByAuthorId(Long id);
	public List<Author> getAll();
}
