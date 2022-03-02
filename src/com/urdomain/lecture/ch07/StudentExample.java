package com.urdomain.lecture.ch07;

public class StudentExample {

	public static void main(String[] args) {
		
		Student student = new Student("minsoo", "1234-1234-1234", 21);
		
		System.out.println(student.name);
		System.out.println(student.ssn);
		System.out.println(student.studentNo);
		
		Student student2 = new Student("minju", "333-3334-1333", 21);
		
		System.out.println(student2.name);
		System.out.println(student2.ssn);
		System.out.println(student2.studentNo);
		
//		Student student3 = new Student();   // 생성자를 생성하면 기본생성자는 생성이 안됩니다.
//		
//		System.out.println(student3.name);
//		System.out.println(student3.ssn);
//		System.out.println(student3.studentNo);
	}

}
