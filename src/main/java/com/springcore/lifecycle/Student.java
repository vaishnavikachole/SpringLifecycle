package com.springcore.lifecycle;

public class Student {
	private String studentName;

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		System.out.println("setting name");
		this.studentName = studentName;
	}

	public Student() {
		super();

	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + "]";
	}
	public void init()
	{
		System.out.println("Inside init method");
	}
	public void destroy()
	{
		System.out.println("Inside destroy method");
	}
	

}
