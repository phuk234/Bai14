package com.se.service;

import java.util.List;

import com.se.entity.Book;



public interface BookService {
	
	public List<Book> getBooks();
	public void deleteBook(int id);
	public void addBook(Book x);
	public List<Book> searchBooks(String x);
	public List<Book> sortBooks();

}
