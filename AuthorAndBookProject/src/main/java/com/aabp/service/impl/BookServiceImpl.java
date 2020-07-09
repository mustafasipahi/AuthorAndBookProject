package com.aabp.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aabp.dao.BookDAO;
import com.aabp.model.Book;
import com.aabp.service.BookService;

@Service
public class BookServiceImpl implements BookService{

	@Autowired
	private BookDAO bookDao;
	
	@Override
	@Transactional
	public void save(Book book) {
		bookDao.save(book);
	}

	@Override
	@Transactional
	public void update(Book book, int id) {
		Book newBook = bookDao.findByBookId(id);
		newBook = book;
		bookDao.save(newBook);
	}

	@Override
	@Transactional
	public void delete(int id) {
		bookDao.deleteById(id);
	}

	@Override
	public Book findByBookId(int id) {
		return bookDao.findByBookId(id);		
	}

	@Override
	public List<Book> findByName(String bookName) {
		List<Book> booklist = bookDao.findByBookName(bookName);
		return booklist;
	}

	@Override
	public List<Book> getAll() {
		List<Book> newList = bookDao.getAll();
		return newList;
	}

	

}
