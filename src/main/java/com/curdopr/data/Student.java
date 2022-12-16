package com.curdopr.data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "STUDENT")
public class Student {
	
	
	
	@Id
	private String id;
	private String name;
	private String rollnumber;
	private String course;
	private String address;
	


	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRollnumber() {
		return rollnumber;
	}
	public void setRollnumber(String rollnumber) {
		this.rollnumber = rollnumber;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	public Student(String id, String name, String rollnumber, String course, String address) {
		super();
		this.id = id;
		this.name = name;
		this.rollnumber = rollnumber;
		this.course = course;
		this.address = address;
	}
	public Student() {
		
	}
	
	
	
	

}
