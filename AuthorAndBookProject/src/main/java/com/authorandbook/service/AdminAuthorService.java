package com.authorandbook.service;

import org.springframework.stereotype.Service;

import com.authorandbook.model.Author;

@Service
public interface AdminAuthorService {

	public void saveAuthor(Author author);
	public void updateAuthor(Author author, int id);
	public void deleteAuthor(int id);	
}
