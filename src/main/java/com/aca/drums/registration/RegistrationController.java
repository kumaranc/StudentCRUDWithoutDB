package com.aca.drums.registration;

import java.util.HashSet;
import java.util.Set;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {

	Set<Student> students = new HashSet<>();
	
	@PostMapping(path = "/api/v1/student/create")
	public ResponseEntity<String> doCreateStudent(@RequestBody Student student) {
		student.setId(getId(student.getId()));
		students.add(student);
		String result = "{\"id\": "+student.getId()+",\"message\":\"created successfully\" }";
		return ResponseEntity.ok(result);
	}
	
	@PostMapping(path = "/api/v1/student/update")
	public ResponseEntity<String> doUpdateStudent(@RequestBody Student student) {
		student.setId(getId(student.getId()));
		students.add(student);
		String result = "{\"id\": "+student.getId()+",\"message\":\"updated successfully\" }";
		return ResponseEntity.ok(result);
	}
	
	@GetMapping(path = "/api/v1/getstudents")
	public ResponseEntity<Set<Student>> getStudents() {
		return ResponseEntity.ok(students);
	}
	
	@GetMapping(path = "/api/v1/getstudent/{student_id}")
	public ResponseEntity<Student> getStudentsWithId(@PathVariable("student_id") Integer studentId) {
		Student student = students.stream()
				.filter(studentt -> studentt.getId() == studentId).findAny().orElse(null);
		return ResponseEntity.ok(student);
	}
	
	@DeleteMapping(path = "/api/v1/getstudent/{student_id}")
	public ResponseEntity<String> removeStudent(@PathVariable("student_id") Integer studentId) {
		students.removeIf(student -> student.getId() == studentId);
		String result = "{\"id\": "+studentId+",\"message\":\"deleted successfully\" }";
		return ResponseEntity.ok(result);
	}
	
	private int getId(int id) {
		if(id > 0) {
			return id;
		} else return students.size()+1;
	}
}
