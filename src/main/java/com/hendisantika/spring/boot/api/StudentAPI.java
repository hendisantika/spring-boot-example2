package com.hendisantika.spring.boot.api;

import com.hendisantika.spring.boot.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hendisantika.spring.boot.service.StudentService;

@RestController
public class StudentAPI {

	@Autowired
	private StudentService studentService;

	@RequestMapping("/students")
	public Student searchStudent(@RequestParam(name = "studentId", required = true) Integer studentId) {
		Student student = studentService.getStudentById(studentId);
		return student;
	}
}
