package com.se.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity (name = "books")
@Table(name = "books")
public class Book implements Serializable{

	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name; 
	
	@Column(name="author")
	private String author;
	
	@Column(name="publishyear")
	private int publishyear; 
	
	@Column(name="rating")
	private double rating;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPublishyear() {
		return publishyear;
	}

	public void setPublishyear(int publishyear) {
		this.publishyear = publishyear;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public Book(int id, String name, String author, int publishyear, double rating) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.publishyear = publishyear;
		this.rating = rating;
	}

	public Book() {
		super();
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + ", publishyear=" + publishyear + ", rating="
				+ rating + "]";
	}

	
	
	
	
}
