package com.aabp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.aabp.model.Book;

@Service
public interface BookService {

	public void save(Book book);
	public void update(Book book,Long id);
	public void delete(Long id);
	public Book findByBookId(Long id);
	public List<Book> findByName(String bookName);
	public List<Book> getAll();
}
