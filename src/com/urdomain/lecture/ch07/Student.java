package com.urdomain.lecture.ch07;

public class Student extends People{
	
	public int studentNo;
	
	public Student(String name, String ssn, int studentNo) {
		
		super(name, ssn);	// super > 부모생성자
		this.studentNo = studentNo;
	}
	
	// people에서 가져와있음 보이진않아두
}
