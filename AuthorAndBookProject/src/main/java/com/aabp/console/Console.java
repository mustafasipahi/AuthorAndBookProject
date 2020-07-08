package com.aabp.console;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.aabp.model.Author;
import com.aabp.model.Book;
import com.aabp.service.impl.AutHorServiceImpl;
import com.aabp.service.impl.BookServiceImpl;

@Component
public class Console implements CommandLineRunner{

	@Autowired
	private AutHorServiceImpl autHorServiceImpl;
	
	@Autowired
	private BookServiceImpl bookServiceImpl;
	
	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("Çalışıyor");
		Author author = new Author();
		author.setId(1);
		author.setFirstName("Mustafa");
		author.setLastName("Sipahi");
		autHorServiceImpl.save(author);		
		List<Author> authorsList = autHorServiceImpl.getAll();
		for(Author myauthor : authorsList) {
			System.out.println(myauthor);
		}
		
		System.out.println("Çalışıyor");
		Book book = new Book();
		book.setId(1);
		book.setBookName("Altın Portakal");
		book.setAuthor("Yazar");
		bookServiceImpl.save(book);
		List<Book> bookList = bookServiceImpl.getAll();
		for(Book mybook : bookList){
			System.out.println(mybook);
		}
	}

}
