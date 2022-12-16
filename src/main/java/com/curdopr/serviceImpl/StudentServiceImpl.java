package com.curdopr.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curdopr.data.Student;
import com.curdopr.repository.StudentRepository;
import com.curdopr.service.StudentService;


@Service
public class StudentServiceImpl implements StudentService{

	@Autowired 
	private StudentRepository studentRepository;
	
	
	
	
	@Override
	public Student getStudentDetails(String id) {
		Student result = null;
		Optional<Student> stud = Optional.empty();
		if(null != id && !id.isEmpty()) {
			stud =  studentRepository.findById(id);
		}
		if(stud.isPresent()) {
			result = stud.get();
		}
		return result;
	}
	
	
	

	@Override
	public String addStudent(Student student) {
		String res=null;
		if(null != student) {
			if(null != student.getId() &&!student.getId().isEmpty()) {
				res = studentRepository.save(student).toString();
			}
		}
		return res;
	}
	
	
	
	

	@Override
	public Student updateStudentDetails(Student student) {
		Student updated = null;
		Optional<Student> result = null;
		if(null != student && null != student.getId() && !student.getId().isEmpty()) {
			result = studentRepository.findById(student.getId());
		}
		if(result.isPresent()) {
			Student updatedStud = result.get();
			updatedStud.setAddress(student.getAddress());
			updatedStud.setCourse(student.getCourse());
			updatedStud.setName(student.getName());
			updatedStud.setRollnumber(student.getRollnumber());
			updated = studentRepository.save(updatedStud);
			;
		}
		return updated;
	}
	
	
	

	@Override
	public Boolean deleteStudent(String id) {
		Boolean result = Boolean.FALSE;
		Optional<Student> stud = Optional.empty();
		if(null != id && !id.isEmpty()) {
			stud =  studentRepository.findById(id);
		}
		if(stud.isPresent()) {
			studentRepository.deleteById(id);		
			result = Boolean.TRUE;
		}
		return result;
	}

}
