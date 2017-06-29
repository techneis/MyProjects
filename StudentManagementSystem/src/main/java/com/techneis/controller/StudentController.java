/**
 * 
 */
package com.techneis.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techneis.objects.Student;

/**
 * @author Neeraj
 *
 */
@RestController
//@RequestMapping("/kashyap")
public class StudentController {
	
	@RequestMapping("/execute")
	public String sayHello(){
		
		return "Hello!";
	}
	
	@RequestMapping("/getAllStudents")
	public List<Student> getStudents(){
		 List<Student> listOfStudents= Arrays.asList(				 
		 new Student(101, "Niharika", "nikki@gmail.com"),
		 new Student(102, "Bunty", "bunty@gmail.com"),
		 new Student(103, "Harsh", "harsh@gmail.com"),
		 new Student(104, "Sakshi", "sakshi@gmail.com"),
		 new Student(105, "Pihoo", "taapsi@gmail.com"));
		 
		 return listOfStudents;			 
	}

}
