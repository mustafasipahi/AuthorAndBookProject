package com.authorandbook.service.impl;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.authorandbook.model.Author;
import com.authorandbook.repository.AuthorRepository;
import com.authorandbook.service.AuthorService;

@Service
public class AuthorServiceImpl implements AuthorService{

	@Autowired
	private AuthorRepository authorDAO;
	
	@Override
	@Transactional
	public void save(Author author) {		
		authorDAO.save(author);
	}

	@Override
	@Transactional
	public void update(Author author, int id) {
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
	public Author findByAuthorId(int id) {
		Author newAuthor = authorDAO.findById(id);		
		return newAuthor;
	}

	@Override
	public List<Author> getAll() {
		List<Author> allAuthors = authorDAO.listAllAuthor();
		return allAuthors;
	}
}
