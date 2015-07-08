package com.hb.lab3;

import javax.persistence.Embeddable;

@Embeddable
public class SchoolDetails {

	private String schoolAddress;
	private boolean isPublicSchool;
	private int studentCount;
	
	public String getSchoolAddress() {
		return schoolAddress;
	}
	public void setSchoolAddress(String schoolAddress) {
		this.schoolAddress = schoolAddress;
	}
	public boolean isPublicSchool() {
		return isPublicSchool;
	}
	public void setPublicSchool(boolean isPublicSchool) {
		this.isPublicSchool = isPublicSchool;
	}
	public int getStudentCount() {
		return studentCount;
	}
	public void setStudentCount(int studentCount) {
		this.studentCount = studentCount;
	}
}
