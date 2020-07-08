package com.aabp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.aabp.model.Book;
import com.aabp.service.impl.BookServiceImpl;

@RestController
@RequestMapping("/library")
public class BookController {

	@Autowired
	private BookServiceImpl bookServiceImpl;
	
	@PostMapping("/book/save")
	@ResponseBody
	public void save(Book book) {
		bookServiceImpl.save(book);
	}
	
	@PostMapping("/book/update/{id}")
	@ResponseBody
	public void update(Book book,@PathVariable("id") Long id) {
		bookServiceImpl.update(book,id);
	}
	
	@RequestMapping("/book/delete/{id}")
	@ResponseBody
	public void delete(@PathVariable("id") Long id) {
		bookServiceImpl.delete(id);
	}
	
	@GetMapping("/search/{id}")
	@ResponseBody
	public Book findByBookId(@PathVariable("id")Long id) {
		Book book = bookServiceImpl.findByBookId(id);
		return book;
	}
	
	@GetMapping("/search/{bookName}")
	@ResponseBody
	public List<Book> findByName(@PathVariable("bookName")String bookName){
		List<Book> bookList = bookServiceImpl.findByName(bookName);
		return bookList;
	}
	
	@GetMapping("/search/all")
	@ResponseBody
	public List<Book> getAll(){
		List<Book> bookList = bookServiceImpl.getAll();
		return bookList;
	}
}
