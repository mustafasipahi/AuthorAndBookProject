package com.authorandbook.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.authorandbook.model.Author;

@Repository
public interface AdminAuthorRepository extends CrudRepository<Author, Integer>{

	@Query("SELECT a FROM Author a WHERE a.id = :id")
	public Author findById(@Param("id") int id);
}
