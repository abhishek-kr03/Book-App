package com.bookapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bookapp.entity.Book;
import com.bookapp.repository.BookRepository;

@Component
public class BookServices {

	@Autowired
	BookRepository br;
	
	public List<Book> getAllBooks() {
		 return (List<Book>)br.findAll();
	}
	
	public Book getBookById(int id) {
		return br.findById(id);
	}
	
	public String insertBook(Book book) {
		br.save(book);
		return "Book inserted";
	}

	public String update(int id, Book b) {
		 b.setId(id);
		 br.save(b);
		 return "Book Updated";
	}

	public String deleteBookById(int id) {
		br.deleteById(id);
		return "book with id " + id + " gets deleted";
	}
}
