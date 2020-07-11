package com.authorandbook.console;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;import com.authorandbook.model.Book;
import com.authorandbook.service.AdminAuthorService;
import com.authorandbook.service.AdminBookService;
import com.authorandbook.service.AuthorService;
import com.authorandbook.service.BookService;

@Component
public class Console implements CommandLineRunner{

//	@Autowired
//	private AdminBookService adminBookService;
	
//	@Autowired
//	private AdminAuthorService adminAuthorService;
	
//	@Autowired
//	private AuthorService authorService;
	
//	@Autowired
//	private BookService bookServiceimpl;
	
	@Override
	public void run(String... args) throws Exception {
		
	}
}
