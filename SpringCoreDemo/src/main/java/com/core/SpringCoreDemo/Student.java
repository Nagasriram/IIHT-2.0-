package com.core.SpringCoreDemo;

public class Student {

	private Integer studentID;
	private String studentName;
	private String address;

	public Student() {
		super();
	}

	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", studentName=" + studentName + ", address=" + address + "]";
	}

	public Student(Integer studentID, String studentName, String address) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;
		this.address = address;
	}

	public Integer getStudentID() {
		return studentID;
	}

	public void setStudentID(Integer studentID) {
		System.out.println("setting student Id");
		this.studentID = studentID;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		System.out.println("setting student Name");
		this.studentName = studentName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		System.out.println("setting student Address");
		this.address = address;
	}

}
