package com.aca.drums.registration;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

public class Student implements Serializable{

	private int id;
	
	private String dob;
	
	private int age;
	
	private String fathername;
	
	private String contactno;
	
	private String mothername;
	
	private String address;
	
	private String courselocation;
	
	private String courseaddress;
	
	private String course;
	
	private String trainer;
	
	private List<Map<String, String>> daysattended = new ArrayList<>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFathername() {
		return fathername;
	}

	public void setFathername(String fathername) {
		this.fathername = fathername;
	}

	public String getContactno() {
		return contactno;
	}

	public void setContactno(String contactno) {
		this.contactno = contactno;
	}

	public String getMothername() {
		return mothername;
	}

	public void setMothername(String mothername) {
		this.mothername = mothername;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCourselocation() {
		return courselocation;
	}

	public void setCourselocation(String courselocation) {
		this.courselocation = courselocation;
	}

	public String getCourseaddress() {
		return courseaddress;
	}

	public void setCourseaddress(String courseaddress) {
		this.courseaddress = courseaddress;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getTrainer() {
		return trainer;
	}

	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}

	public List<Map<String, String>> getDaysattended() {
		return daysattended;
	}

	public void setDaysattended(List<Map<String, String>> daysattended) {
		this.daysattended = daysattended;
	}

	
}
