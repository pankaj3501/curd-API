package com.curdopr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.curdopr.data.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, String>{
	
}

