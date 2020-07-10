package com.authorandbook.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.authorandbook.model.Book;
import com.authorandbook.service.AdminBookService;

@RestController
@RequestMapping("/admin")
public class AdminBookController {

	private AdminBookService adminBookService;
	
	@GetMapping("/book/search/{id}")
	@ResponseBody
	public Book findByBookId(@PathVariable("id") int id) {
		return adminBookService.findByBookId(id);	
	}
	
	@PostMapping("/book/save")
	@ResponseBody
	public void saveBook(Book book) {
		adminBookService.saveBook(book);
	}
	
	@PostMapping("/book/update")
	@ResponseBody
	public void updateBook(Book book,int id) {
		adminBookService.updateBook(book, id);
	}
	
	@PostMapping("/book/delete")
	@ResponseBody
	public void deleteBook(int id) {
		adminBookService.deleteBook(id);
	}
	
}
