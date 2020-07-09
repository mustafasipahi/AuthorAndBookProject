package com.authorandbook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.authorandbook.model.Author;
import com.authorandbook.service.AuthorService;

@RestController
@RequestMapping("/person")
public class AuthorController {

	@Autowired
	private AuthorService autHorService;
	
	@PostMapping("/author/save")
	@ResponseBody
	public void save(Author author) {
		autHorService.save(author);
	}
	
	@PostMapping("/author/update/{id}")
	@ResponseBody
	public void Update(Author author,@PathVariable("id") int id) {
		autHorService.update(author, id);
	}
	
	@PostMapping("/author/delete/{id}")
	@ResponseBody
	public void delete(@PathVariable ("id")int id) {
		autHorService.delete(id);
	}
	
	@GetMapping("/author/{id}")
	@ResponseBody
	public Author findByAuthorId(@PathVariable("id") int id) {
		return autHorService.findByAuthorId(id);
	}
	
	@GetMapping("/author/search/all")
	public List<Author> getAll(){
		return autHorService.getAll();
	}
}
