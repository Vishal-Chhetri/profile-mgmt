/**
 * 
 */
package com.project.school.profilemgmt.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Vishal
 *
 */
@Document(collection = "guardian")
public class Guardian {
	
	@Id
	private String guardianId;
	private String fname;
	private String mname;
	private String lname;
	private String relation;
	private List<String> studentIds;
	public Guardian() {
		super();
	}
	public String getGuardianId() {
		return guardianId;
	}
	public void setGuardianId(String guardianId) {
		this.guardianId = guardianId;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getRelation() {
		return relation;
	}
	public void setRelation(String relation) {
		this.relation = relation;
	}
	public List<String> getStudentIds() {
		return studentIds;
	}
	public void setStudentIds(List<String> studentIds) {
		this.studentIds = studentIds;
	}
	
	

}
