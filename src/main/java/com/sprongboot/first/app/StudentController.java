package com.sprongboot.first.app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
		/*
		 * http://localhost:8080/student
		 */
		@GetMapping("/student")
		public Student getStudent() {
			return new Student("Arbaz", "AHmed");
		}
		
		/*
		 * http://localhost:8080/students
		 */
		@GetMapping("/students")
		public List<Student> getStudents(){
			
			List<Student> students  = new ArrayList<>();
			students.add(new Student("Arbaz","AHmed"));
			students.add(new Student("saif","AHmed"));
			students.add(new Student("xyz","AHmed"));
			students.add(new Student("zzz","AHmed"));
			students.add(new Student("sdd","AHmed"));
			
			return students;
			}
		
		/*
		 * http://localhost:8080/student/farbaz/lamed
		 */
		@GetMapping("/student/{firstname}/{lastname}")
		public Student StudentPathVariable(@PathVariable("firstname") String firstname, @PathVariable("lastname") String lastname) {
			
			return new Student(firstname, lastname);
		}
		/*
		 * http://localhost:8080/student/query?firstname=arbaz&lastname=amed
		 */
		@GetMapping("/student/query")
		public Student studentQueryparam(
				@RequestParam(name = "firstname") String firstname,
				@RequestParam(name = "lastname") String lastname) {
			
			return new Student(firstname,lastname);
			
		}
			
		
}
