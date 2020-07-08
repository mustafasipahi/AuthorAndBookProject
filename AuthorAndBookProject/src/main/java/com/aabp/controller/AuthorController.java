package com.aabp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.aabp.model.Author;
import com.aabp.service.impl.AutHorServiceImpl;

@RestController
@RequestMapping("/person")
public class AuthorController {

	@Autowired
	private AutHorServiceImpl autHorServiceImpl;
	
	@PostMapping("/author/save")
	@ResponseBody
	public void save(Author author) {
		autHorServiceImpl.save(author);
	}
	
	@PostMapping("/author/update/{id}")
	@ResponseBody
	public void Update(Author author,@PathVariable("id") Long id) {
		autHorServiceImpl.update(author, id);
	}
	
	@PostMapping("/author/delete/{id}")
	@ResponseBody
	public void delete(@PathVariable ("id")int id) {
		autHorServiceImpl.delete(id);
	}
	
	@GetMapping("/author/{id}")
	@ResponseBody
	public Author findByAuthorId(@PathVariable("id") Long id) {
		return autHorServiceImpl.findByAuthorId(id);
	}
	
	@GetMapping("/author/search/all")
	public List<Author> getAll(){
		return autHorServiceImpl.getAll();
	}
}
