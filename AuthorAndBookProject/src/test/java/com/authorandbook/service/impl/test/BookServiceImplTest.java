package com.authorandbook.service.impl.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.authorandbook.model.Author;
import com.authorandbook.model.Book;
import com.authorandbook.service.AuthorService;
import com.authorandbook.service.BookService;
import com.authorandbook.service.impl.BookServiceImpl;

@SpringBootTest
public class BookServiceImplTest {

	@Autowired
	private BookServiceImpl bookServiceImpl;
	
	@Autowired
	private AuthorService authorService;
	
	@Test
	public void saveTest() {
//		Book testBook = new Book();
//		testBook.setId(5);
//		testBook.setBookName("Test Name");
//		testBook.setBookAuthor("Test Author");
		
		//bookServiceImpl.save(testBook);		
		//Book testbook2 = bookServiceImpl.findByBookId(5);
		
		//assertEquals(testbook2.getId(), testBook.getId());
		//assertTrue(testbook2.getId() > 0);
		
		
		Author author = new Author();
		author.setId(15);
		author.setFirstName("TestFirstName");
		author.setLastName("TestLastName");
		authorService.save(author);
		
	}
}
