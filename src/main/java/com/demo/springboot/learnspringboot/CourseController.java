package com.demo.springboot.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class CourseController {

	// /courses
	// Course: id, name, author
	
	@RequestMapping("/courses")
	public List<Course> retrieveAllCourses() {
		return Arrays.asList(
				new Course(1,"Learn springBoot", "Demo"),
				new Course(2,"Learn AWS", "Demo"),
				new Course(3,"Learn Azure", "Demo"),
				new Course(3,"Learn GCP", "Demo")
				);
		
	}
}
