package com.curdopr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.curdopr.data.Student;
import com.curdopr.service.StudentService;

@RestController
@RequestMapping("/rest")
public class CurdController {
	
	@Autowired
	private StudentService studentService;
	
	
	@GetMapping("/get")
	public Student getResult(@RequestParam String id) {
		Student stud = null; 
		stud = studentService.getStudentDetails(id);
		return stud;
	}
	
	@PostMapping("/add")
	public String addStudent(@RequestBody Student student) {
		String response ="";
		response = studentService.addStudent(student);
		return response;
	}
	
	@PostMapping("/update")
	public Student updateStudent(@RequestBody Student student) {
		Student stud = null;
		stud = studentService.updateStudentDetails(student);
		return stud;
	}
	
	@DeleteMapping("/delete")
	public Boolean deleteStudent(@RequestParam String id) {
		Boolean result = null;
		result = studentService.deleteStudent(id);
		return result;
	}

}
