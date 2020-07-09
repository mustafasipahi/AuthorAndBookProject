package com.authorandbook.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.authorandbook.model.Author;

@Repository
public interface AuthorRepository extends CrudRepository<Author, Integer>{

	@Query("SELECT a FROM Author a WHERE a.id = :id")
	public Author findById(@Param("id") int id);
	
	@Query("SELECT a FROM Author a WHERE a.firstName= :name")
	public List<Author> findByName(@Param("name")String name);
	
	@Query("SELECT a FROM Author a")
	public List<Author> listAllAuthor();
}
