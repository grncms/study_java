package com.urdomain.lecture.ch06.exc;

public class SecondCarExample {

	public static void main(String[] args) {
		
		
		SecondCar secondCar = new SecondCar();
		
		System.out.println("company : " + secondCar.company);
		System.out.println("model : " + secondCar.model);
		System.out.println("color : " + secondCar.color);
		System.out.println("maxSpeed : " + secondCar.maxSpeed);
		
		
		secondCar.model = "아우디";
		
		System.out.println("-----------------");
		System.out.println("company : " + secondCar.company);
		System.out.println("model : " + secondCar.model);
		System.out.println("color : " + secondCar.color);
		System.out.println("maxSpeed : " + secondCar.maxSpeed);
		
		
//		
		SecondCar secondCar2 = new SecondCar("테슬라","gray");

		System.out.println("-----------------");
		System.out.println("company : " + secondCar2.company);
		System.out.println("model : " + secondCar2.model);
		System.out.println("color : " + secondCar2.color);
		System.out.println("maxSpeed : " + secondCar2.maxSpeed);
		

//		
		SecondCar secondCar3 = new SecondCar("벤츠","red",300);
		
		System.out.println("-----------------");
		System.out.println("company : " + secondCar3.company);
		System.out.println("model : " + secondCar3.model);
		System.out.println("color : " + secondCar3.color);
		System.out.println("maxSpeed : " + secondCar3.maxSpeed);
		
		
	}

}
