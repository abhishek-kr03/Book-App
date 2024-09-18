package com.bookapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bookapp.entity.Book;
import com.bookapp.services.BookServices;

@RestController
public class BookController {

	@Autowired
	BookServices bs;
	
	@GetMapping("/book")
	public List<Book> getAllBooks() {
		return bs.getAllBooks();
	}
	
	@GetMapping("/book/{id}")
	public Book getBookById(@PathVariable("id") int id) {
		return bs.getBookById(id);
	}
	
	@PostMapping("/book")
	public String insertBook(@RequestBody Book b) {
		return bs.insertBook(b);
	}
	
	@PutMapping("/book/{id}")
	public String updateBook(@PathVariable("id") int id, @RequestBody Book b) {
		return bs.update(id, b);
	}
	
	@DeleteMapping("/book/{id}")
	public String deleteBook(@PathVariable("id") int id) {
		return bs.deleteBookById(id);
	}
}
