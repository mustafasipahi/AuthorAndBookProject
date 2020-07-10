package com.authorandbook.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.authorandbook.model.Book;
import com.authorandbook.repository.AdminBookRepository;
import com.authorandbook.service.AdminBookService;

@Service
public class AdminBookServiceImpl implements AdminBookService{

	@Autowired
	private AdminBookRepository adminBookRepository;
	
	@Override
	@Transactional
	public Book findByBookId(int id) {
		return adminBookRepository.findByBookId(id);	
	}
	
	@Override
	@Transactional
	public void saveBook(Book book) {
		adminBookRepository.save(book);
	}

	@Override
	@Transactional
	public void updateBook(Book book, int id) {
		Book newBook = adminBookRepository.findByBookId(id);
		newBook = book;
		adminBookRepository.save(newBook);
	}

	@Override
	@Transactional
	public void deleteBook(int id) {
		adminBookRepository.deleteById(id);
	}

}
