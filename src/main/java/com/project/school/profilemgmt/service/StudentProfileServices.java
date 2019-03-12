/**
 * 
 */
package com.project.school.profilemgmt.service;

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
	
	public Student createStudentProfile(Student student) {
		//student.setJoiningDate(new Date());
		return studentProfileRepository.save(student);
	}

}
