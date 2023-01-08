package com.example.learnjpahibernate.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name="Course")
public class Course1 {
	@Id 
	private long id;
	@Column(name="name")
	private String name;
	@Column(name="author")
	private String author;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
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
	public Course1() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Course1(long id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", author=" + author + "]";
	}
	
	
	
	
}
