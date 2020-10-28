package com.example.mysql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

@RestController
public class BookController {
	
	@Autowired
	BookRepository bookRepository;
	
	@PostMapping("/bookSave")
	public String insertBook(@RequestBody Book book) {
		bookRepository.save(book);
		return "Your record is saved is saved successfully";
	}
}
