package com.authorandbook.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.authorandbook.model.Book;

@Repository
public interface AdminBookRepository extends CrudRepository<Book, Integer>{

	@Query("SELECT b FROM Book b WHERE b.id =:id")
	public Book findByBookId(@Param("id")int id);
}
