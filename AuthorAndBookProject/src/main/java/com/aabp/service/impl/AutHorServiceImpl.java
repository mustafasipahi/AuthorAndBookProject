package com.aabp.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aabp.dao.AuthorDAO;
import com.aabp.model.Author;
import com.aabp.service.AuthorService;

@Service
public class AutHorServiceImpl implements AuthorService{

	@Autowired
	private AuthorDAO authorDAO;
	
	@Override
	@Transactional
	public void save(Author author) {		
		authorDAO.save(author);
	}

	@Override
	@Transactional
	public void update(Author author, Long id) {
		Author newAuthor = authorDAO.findById(id);
		newAuthor = author;
		authorDAO.save(newAuthor);
	}

	@Override
	@Transactional
	public void delete(int id) {
		authorDAO.deleteById(id);
	}

	@Override
	public Author findByAuthorId(Long id) {
		Author newAuthor = authorDAO.findById(id);		
		return newAuthor;
	}

	@Override
	public List<Author> getAll() {
		List<Author> allAuthors = authorDAO.listAllAuthor();
		return allAuthors;
	}

}
