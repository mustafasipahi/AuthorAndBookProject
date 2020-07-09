package com.authorandbook.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.authorandbook.model.Book;
import com.authorandbook.repository.BookRepository;
import com.authorandbook.service.AdminBookService;

@Service
public class AdminBookServiceImpl implements AdminBookService{

	@Autowired
	private BookRepository bookRepository;
	
	@Override
	@Transactional
	public void saveBook(Book book) {
		bookRepository.save(book);
	}

	@Override
	@Transactional
	public void updateBook(Book book, int id) {
		Book newBook = bookRepository.findByBookId(id);
		newBook = book;
		bookRepository.save(newBook);
	}

	@Override
	@Transactional
	public void deleteBook(int id) {
		bookRepository.deleteById(id);
	}

}
