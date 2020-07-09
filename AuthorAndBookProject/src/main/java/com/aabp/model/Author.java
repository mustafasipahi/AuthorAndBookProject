package com.aabp.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_author")
public class Author implements Serializable{

	private static final long serialVersionUID = -3776226123284943027L;

	@Id	
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "author_id")
	private int id;
	
	@Column(name = "author_first_name")
	private String firstName;
	
	@Column(name = "author_last_name")
	private String lastName;
	
//	private List<Book> books;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
//	public List<Book> getBooks() {
//		return books;
//	}
//	public void setBooks(List<Book> books) {
//		this.books = books;
//	}
	@Override
	public String toString() {
		return "Author [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", "
				+ "books=" + "]";
	}	
	
}
