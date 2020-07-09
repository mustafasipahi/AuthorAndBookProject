package com.aabp.console;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.aabp.model.Author;
import com.aabp.model.Book;
import com.aabp.service.BookService;
import com.aabp.service.AuthorService;
import com.aabp.service.impl.AutHorServiceImpl;
import com.aabp.service.impl.BookServiceImpl;

@Component
public class Console implements CommandLineRunner{

//	@Autowired
//	private AuthorService autHorService;
	
	@Autowired
	private BookService bookService;
	
	@Override
	public void run(String... args) throws Exception {
		
//		System.out.println("Runing..");
//		Author author = new Author();
//		author.setId(1);
//		author.setFirstName("Mustafa");
//		author.setLastName("Sipahi");
//		autHorService.save(author);		
//		List<Author> authorsList = autHorServiceImpl.getAll();
//		for(Author myauthor : authorsList) {
//			System.out.println(myauthor);
//		}
				
//		Book book = new Book();
//		book.setId(3);
//		book.setBookName("Kitab ismi");
//		book.setBookAuthor("Beim Kitap");
//		bookService.update(book, 3);
		
		System.out.println(bookService.findByName("Mustafa"));

	}

}
