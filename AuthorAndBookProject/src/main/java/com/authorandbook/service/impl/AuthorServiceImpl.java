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
	private AuthorRepository authorRep;
	
	@Override
	@Transactional
	public void save(Author author) {		
		authorRep.save(author);
	}

	@Override
	@Transactional
	public void update(Author author, int id) {
		delete(id);
		author.setId(id);
		authorRep.save(author);
	}

	@Override
	@Transactional
	public void delete(int id) {
		if (authorRep.findById(id) != null) {
			authorRep.deleteById(id);			
		}
	}

	@Override
	public Author findByAuthorId(int id) {
		Author newAuthor = authorRep.findById(id);		
		return newAuthor;
	}

	@Override
	public List<Author> getAll() {
		List<Author> allAuthors = authorRep.listAllAuthor();
		return allAuthors;
	}
}
