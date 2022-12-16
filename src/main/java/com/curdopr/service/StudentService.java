package com.curdopr.service;

import com.curdopr.data.Student;

public interface StudentService {




	public Student getStudentDetails(String id);

	public String addStudent(Student student);

	public Student updateStudentDetails(Student student);

	public Boolean deleteStudent(String id);
	

}
