package com.authorandbook.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.authorandbook.model.Author;

@Service
public interface AuthorService {

	public void save(Author author);
	public void update(Author author, int id);
	public void delete(int id);
	public Author findByAuthorId(int id);
	public List<Author> getAll();
}
