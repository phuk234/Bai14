package com.se.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.se.entity.Book;




@Repository
public class BookDaoImpl implements BookDao{
	@Autowired
	@Qualifier("webSessionFactory")
	private SessionFactory sessionFactory;
	
	
    
	public BookDaoImpl() {
		super();
	}



	@Override
	public List<Book> getBooks() {
    	// get the current hibernate session
        Session currentSession = sessionFactory.getCurrentSession();
        // create a query  ... sort by last name
        Query<Book> theQuery = currentSession.createNativeQuery("Select *from books",Book.class); 
                       //currentSession.createQuery("from books");
      
        // execute query and get result list
        List<Book> kq=theQuery.getResultList();
        // return the results		
        return kq;
	}
	
	
	@Override
	public List<Book> sortBooks() {
    	// get the current hibernate session
        Session currentSession = sessionFactory.getCurrentSession();
        // create a query  ... sort by last name
        Query<Book> theQuery = currentSession.createNativeQuery("Select *from books order by name asc",Book.class); 
                       //currentSession.createQuery("from books");
      
        // execute query and get result list
        List<Book> kq=theQuery.getResultList();
        // return the results		
        return kq;
	}

	@Override
	public List<Book> searchBooks(String x) {
    	// get the current hibernate session
        Session currentSession = sessionFactory.getCurrentSession();
        // create a query  ... sort by last name
        Query<Book> theQuery = currentSession.createNativeQuery("Select *from books where name like N'%%"+x+"%%'",Book.class); 
                       //currentSession.createQuery("from books");
      
        // execute query and get result list
        List<Book> kq=theQuery.getResultList();
        // return the results		
        return kq;
	}



	@Override
	public void deleteBook(int id) {
		Session currentSession = sessionFactory.getCurrentSession();
        currentSession.createNativeQuery("delete from books where id="+id).executeUpdate();
                      
	}
	
	

	@Override
	public void addBook(Book x) {
		Session currentSession = sessionFactory.getCurrentSession();
        currentSession.createNativeQuery("insert Books values('"+x.getName()+"','"+x.getAuthor()+"',"+x.getPublishyear()+","+x.getRating()+")").executeUpdate();
                      
	}

}
