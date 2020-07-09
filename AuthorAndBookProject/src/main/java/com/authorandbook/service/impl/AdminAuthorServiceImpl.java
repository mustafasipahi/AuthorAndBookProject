package com.authorandbook.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.authorandbook.model.Author;
import com.authorandbook.repository.AuthorRepository;
import com.authorandbook.service.AdminAuthorService;

@Service
public class AdminAuthorServiceImpl implements AdminAuthorService{

	@Autowired
	private AuthorRepository authorRepository;
	
	@Override
	@Transactional
	public void saveAuthor(Author author) {
		authorRepository.save(author);
	}

	@Override
	@Transactional
	public void updateAuthor(Author author, int id) {
		Author newAuthor = authorRepository.findById(id);
		newAuthor = author;
		authorRepository.save(newAuthor);
	}

	@Override
	@Transactional
	public void deleteAuthor(int id) {
		authorRepository.deleteById(id);
	}

}
