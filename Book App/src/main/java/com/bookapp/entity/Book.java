package com.bookapp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Book {
	
	@Id
	@Column(name = "book_id")
	private int id;
	
	@Column(name = "book_title")
	private String title;
	
	@Column(name = "book_author")
	private String author;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + "]";
	}
	
}
