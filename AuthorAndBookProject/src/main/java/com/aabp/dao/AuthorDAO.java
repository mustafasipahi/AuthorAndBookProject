package com.aabp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.aabp.model.Author;

@Repository
public interface AuthorDAO extends CrudRepository<Author, Integer>{

	@Query("SELECT a FROM Author a WHERE a.id = :id")
	public Author findById(@Param("id") Long id);
	
	@Query("SELECT a FROM Author a WHERE a.firstName= :name")
	public List<Author> findByName(@Param("name")String name);
	
	@Query("SELECT a FROM Author a")
	public List<Author> listAllAuthor();
}
