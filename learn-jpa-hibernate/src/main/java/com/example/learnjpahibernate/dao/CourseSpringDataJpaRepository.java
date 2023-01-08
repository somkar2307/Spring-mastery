package com.example.learnjpahibernate.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.learnjpahibernate.models.Course1;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course1, Long>{

	List<Course1> findByAuthor(String author);
}
