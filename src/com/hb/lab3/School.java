package com.hb.lab3;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="School")
public class School {
	
	private int schoolId;
	private String schoolName;
	
	private SchoolDetails SchoolDetails = new SchoolDetails();
	
	@Embedded
	public SchoolDetails getSchoolDetails() {
		return SchoolDetails;
	}
	public void setSchoolDetails(SchoolDetails schoolDetails) {
		SchoolDetails = schoolDetails;
	}
	
	@Id
	@GeneratedValue
	public int getSchoolId() {
		return schoolId;
	}
	public void setSchoolId(int schoolId) {
		this.schoolId = schoolId;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
}
