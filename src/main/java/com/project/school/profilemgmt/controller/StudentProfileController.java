
package com.project.school.profilemgmt.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.school.profilemgmt.model.Student;
import com.project.school.profilemgmt.service.StudentProfileServices;

/**
 * @author Vishal
 *
 */
@RestController
@RequestMapping("/studentProfile")
public class StudentProfileController {
	
	@Autowired
	private StudentProfileServices studentProfileService; 
	
	@GetMapping("/getUserProfileById")
	public void getUserProfileById(@PathParam(value="id") String id) {
		System.out.println("testing"+id);
	}
	
	@PutMapping("/createStudentProfile")
	public Student createStudentProfile(@RequestBody Student student) {		
		return studentProfileService.createStudentProfile(student);
	}

}
