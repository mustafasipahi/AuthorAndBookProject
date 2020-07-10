package com.authorandbook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.authorandbook.model.Book;
import com.authorandbook.service.BookService;

@RestController
@RequestMapping("/library")
public class BookController {

	@Autowired
	private BookService bookService;
	
	@PostMapping("/book/save")
	@ResponseBody
	public void save(Book book) {
		bookService.save(book);
	}
	
	@PostMapping("/book/update/{id}")
	@ResponseBody
	public void update(Book book,@PathVariable("id") int id) {
		bookService.update(book,id);
	}
	
	@RequestMapping("/book/delete/{id}")
	@ResponseBody
	public void delete(@PathVariable("id") int id) {
		bookService.delete(id);
	}
	
	@GetMapping("/book/search/{id}")
	@ResponseBody
	public Book findByBookId(@PathVariable("id")int id) {
		Book book = bookService.findByBookId(id);
		return book;
	}
	
	@GetMapping("/book/search/bookName")
	@ResponseBody
	public List<Book> findByName(@PathVariable("bookName")String bookName){
		List<Book> bookList = bookService.findByName(bookName);
		return bookList;
	}
	
	@GetMapping("/search/all")
	@ResponseBody
	public List<Book> getAll(){
		List<Book> bookList = bookService.getAll();
		return bookList;
	}
}
