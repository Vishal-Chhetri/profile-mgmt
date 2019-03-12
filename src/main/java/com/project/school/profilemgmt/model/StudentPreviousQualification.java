/**
 * 
 */
package com.project.school.profilemgmt.model;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Vishal
 *
 */
@Document(collection = "studentPreviousQualification")
public class StudentPreviousQualification {
	
	private String studentId;
	private String schoolName;
	private String schoolAddress;
	private String qualifications;
	public StudentPreviousQualification() {
		super();
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public String getSchoolAddress() {
		return schoolAddress;
	}
	public void setSchoolAddress(String schoolAddress) {
		this.schoolAddress = schoolAddress;
	}
	public String getQualifications() {
		return qualifications;
	}
	public void setQualifications(String qualifications) {
		this.qualifications = qualifications;
	}
	

}
