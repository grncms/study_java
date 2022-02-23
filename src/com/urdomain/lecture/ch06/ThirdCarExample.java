package com.urdomain.lecture.ch06;

public class ThirdCarExample {

	public static void main(String[] args) {
		
		
		ThirdCar ThirdCar1 = new ThirdCar();
		
		System.out.println("company : " + ThirdCar1.company);
		
		
		ThirdCar ThirdCar2 = new ThirdCar("테슬라");

		System.out.println("-----------------");
		System.out.println("company : " + ThirdCar2.company);
		System.out.println("model : " + ThirdCar2.model);
		
		
		ThirdCar ThirdCar3 = new ThirdCar("자가용","gray");

		System.out.println("-----------------");
		System.out.println("company : " + ThirdCar3.company);
		System.out.println("model : " + ThirdCar3.model);
		System.out.println("color : " + ThirdCar3.color);
		

		ThirdCar ThirdCar4 = new ThirdCar("택시","red",90000);
		
		System.out.println("-----------------");
		System.out.println("company : " + ThirdCar4.company);
		System.out.println("model : " + ThirdCar4.model);
		System.out.println("color : " + ThirdCar4.color);
		System.out.println("maxSpeed : " + ThirdCar4.maxSpeed);
		
		
	}

}
