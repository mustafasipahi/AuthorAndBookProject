package com.authorandbook.service.impl;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.authorandbook.model.Book;
import com.authorandbook.repository.BookRepository;
import com.authorandbook.service.BookService;

@Service
public class BookServiceImpl implements BookService{

	@Autowired
	private BookRepository bookRep;
	
	@Override
	@Transactional
	public void save(Book book) {
		bookRep.save(book);
	}

	@Override
	@Transactional
	public void update(Book book, int id) {
		delete(id);
		book.setId(id);
		bookRep.save(book);		
	}

	@Override
	@Transactional
	public void delete(int id) {
		if (bookRep.findByBookId(id) != null) {
			bookRep.deleteById(id);			
		}
	}

	@Override
	public Book findByBookId(int id) {
		return bookRep.findByBookId(id);		
	}

	@Override
	public List<Book> findByName(String bookName) {
		List<Book> booklist = bookRep.findByBookName(bookName);
		return booklist;
	}

	@Override
	public List<Book> getAll() {
		List<Book> newList = bookRep.getAll();
		return newList;
	}
}
