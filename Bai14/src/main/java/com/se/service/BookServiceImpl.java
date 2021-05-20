package com.se.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.se.dao.BookDaoImpl;
import com.se.entity.Book;



@Service
public class BookServiceImpl implements BookService{
	@Autowired
    private BookDaoImpl bookdao;
	
	
    
   
	public BookServiceImpl() {
		super();
	}




	@Override
	@Transactional("webTransactionManager")
    public List<Book> getBooks() {
            return bookdao.getBooks();
    }




	@Override
	@Transactional("webTransactionManager")
	public void deleteBook(int id) {
		bookdao.deleteBook(id);
		
	}




	@Override
	@Transactional("webTransactionManager")
	public void addBook(Book x) {
		bookdao.addBook(x);
		
	}




	@Override
	@Transactional("webTransactionManager")
	public List<Book> searchBooks(String x) {

		return bookdao.searchBooks(x);
	}




	@Override
	@Transactional("webTransactionManager")
	public List<Book> sortBooks() {
		// TODO Auto-generated method stub
		return bookdao.sortBooks();
	}
}
