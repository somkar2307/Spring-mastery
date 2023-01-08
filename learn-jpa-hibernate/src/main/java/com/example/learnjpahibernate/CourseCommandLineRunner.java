package com.example.learnjpahibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import com.example.learnjpahibernate.dao.CourseJPARepository;
import com.example.learnjpahibernate.dao.CourseSpringDataJpaRepository;
import com.example.learnjpahibernate.models.Course;
import com.example.learnjpahibernate.models.Course1;

@Component
public class CourseCommandLineRunner implements CommandLineRunner{

//	@Autowired
//	private CourseJDBCRepository repository;
	
//	@Autowired
//	private CourseJPARepository repository;
//	
	@Autowired
	private CourseSpringDataJpaRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	
		repository.save(new Course1(1,"learn AWS","abc"));
		repository.save(new Course1(2,"learn SPRING","def"));
		repository.save(new Course1(3,"learn WEB MVC","pqr"));
		//repository.deleteById(1l);
		System.out.println(repository.findAll());
		System.out.println(repository.findByAuthor("abc"));
	}

}
