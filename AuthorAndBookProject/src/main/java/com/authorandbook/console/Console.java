package com.authorandbook.console;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.authorandbook.model.Author;
import com.authorandbook.model.Book;
import com.authorandbook.service.BookService;
import com.authorandbook.service.AuthorService;
import com.authorandbook.service.impl.AuthorServiceImpl;
import com.authorandbook.service.impl.BookServiceImpl;

@Component
public class Console implements CommandLineRunner{

//	@Autowired
//	private AuthorService authorService;
	
//	@Autowired
//	private BookService bookService;
	
	@Override
	public void run(String... args) throws Exception {

		
	}

}
