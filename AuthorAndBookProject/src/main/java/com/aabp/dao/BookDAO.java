package com.aabp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.aabp.model.Book;

@Repository
public interface BookDAO extends CrudRepository<Book, Long> {

	@Query("SELECT b FROM Book b WHERE b.id =:id")
	public Book findByBookId(@Param("id")Long id);
	
	@Query("SELECT b FROM Book b WHERE b.bookName like '%:bookName%")
	public List<Book> findByBookName(@Param("bookName")String bookName);
	
	@Query("SELECT b FROM Book b")
	public List<Book> getAll();
}