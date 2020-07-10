package com.authorandbook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.authorandbook.model.Author;
import com.authorandbook.service.AdminAuthorService;

@RestController
@RequestMapping("/admin")
public class AdminAuthorController {
	
	@Autowired
	private AdminAuthorService adminAuthorService;

	@GetMapping("/author/{id}")
	@ResponseBody
	public Author findById(@PathVariable("id")int id) {
		return adminAuthorService.findById(id);
	}
	
	@PostMapping("/author/save")
	@ResponseBody
	public void saveAuthor(Author author) {
		adminAuthorService.save(author);
	}
	
	@PostMapping("/author/update")
	@ResponseBody
	public void updateAuthor(Author author, int id) {
		adminAuthorService.updateAuthor(author, id);
	}
	
	@PostMapping("/author/delete")
	@ResponseBody
	public void deleteAuthor(int id) {
		adminAuthorService.deleteAuthor(id);
	}
}
