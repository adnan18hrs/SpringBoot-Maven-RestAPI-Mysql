package com.example.mysql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
	
	@Autowired
	BookRepository bookRepository;
	
	@PostMapping("/bookSave")
	public String insertBook(Book book) {
		bookRepository.save(book);
		return "Your record is saved is saved successfully";
	}
}
