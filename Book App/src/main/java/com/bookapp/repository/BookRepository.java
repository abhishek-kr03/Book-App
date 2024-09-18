package com.bookapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.bookapp.entity.Book;

@Component 
public interface BookRepository extends CrudRepository<Book, Integer> {
	
	Book findById(int id);
}
 