package com.urdomain.lecture.ch06;

public class StudentExample {

	public static void main(String[] args) {

//		객체 생성
		
		Student student = new Student(); // 객체이름 00 = new 객체이름

		Student student1;
		student1 = new Student();
		
//		객체는 참조형 변수라서 아래처럼 하면 알수없는 주소값이 보여진다.
		System.out.println("student : " + student);
		System.out.println("student1 : " + student1);
	}

}
