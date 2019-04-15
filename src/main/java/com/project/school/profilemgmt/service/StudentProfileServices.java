/**
 * 
 */
package com.project.school.profilemgmt.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.school.profilemgmt.model.Student;
import com.project.school.profilemgmt.repository.StudentProfileRepository;

/**
 * @author Vishal
 *
 */
@Service
public class StudentProfileServices {
	
	@Autowired
	private StudentProfileRepository studentProfileRepository;
	
	public Student saveStudentProfile(Student student) {
		return studentProfileRepository.save(student);
	}
	public Optional<Student> findById(String id) {
		return studentProfileRepository.findById(id);
	}
}
