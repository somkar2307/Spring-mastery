package com.example.leanspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

	@RequestMapping("/courses")
	public List<Course> retrieveAllCourses(){
		return Arrays.asList(
		new Course(1,"learn aws","5hrs"),
		new Course(2,"learn spring","10hrs"),
		new Course(3,"learn webmvc","11hrs")
				);
		}
}
