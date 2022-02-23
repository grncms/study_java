package com.urdomain.lecture.ch06;

public class PersonExample {

	public static void main(String[] args) {
		
		Person person = new Person("123456-1234567","백호");
		
		System.out.println(person.nation);
		System.out.println(person.ssn);
		System.out.println(person.name);
		
		
		person.name = "을지문덕";
	}

}
