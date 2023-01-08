package com.example.learnjpahibernate.dao;


import org.springframework.stereotype.Repository;

import com.example.learnjpahibernate.models.Course1;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CourseJPARepository {

	@PersistenceContext
	private EntityManager entity;
	

	public void save(Course1 course) {
		entity.merge(course);	
	}
	
	public Course1 findById(long id) {
		return entity.find(Course1.class, id); 
	}
	
	public void deleteById(long id) {
		Course1 course1= entity.find(Course1.class, id);
		entity.remove(course1);
	}
	
}
