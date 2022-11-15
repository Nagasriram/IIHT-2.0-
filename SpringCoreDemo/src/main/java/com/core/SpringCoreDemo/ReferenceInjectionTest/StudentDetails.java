package com.core.SpringCoreDemo.ReferenceInjectionTest;

public class StudentDetails {
	
	private String StudentName;
	private String StudentClass;
	private int StudentAge;
	private String StudentCity;
	private StudentSubjects subs;
	@Override
	public String toString() {
		return "StudentDetails [StudentName=" + StudentName + ", StudentClass=" + StudentClass + ", StudentAge="
				+ StudentAge + ", StudentCity=" + StudentCity + ", subs=" + subs + "]";
	}
	public StudentDetails(String studentName, String studentClass, int studentAge, String studentCity,
			StudentSubjects subs) {
		super();
		StudentName = studentName;
		StudentClass = studentClass;
		StudentAge = studentAge;
		StudentCity = studentCity;
		this.subs = subs;
	}
	public StudentDetails() {
		super();
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public String getStudentClass() {
		return StudentClass;
	}
	public void setStudentClass(String studentClass) {
		StudentClass = studentClass;
	}
	public int getStudentAge() {
		return StudentAge;
	}
	public void setStudentAge(int studentAge) {
		StudentAge = studentAge;
	}
	public String getStudentCity() {
		return StudentCity;
	}
	public void setStudentCity(String studentCity) {
		StudentCity = studentCity;
	}
	public StudentSubjects getSubs() {
		return subs;
	}
	public void setSubs(StudentSubjects subs) {
		this.subs = subs;
	}
	

}
