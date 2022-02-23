package com.urdomain.lecture.ch06;

public class SixCarExample {

	public static void main(String[] args) {
		
		SixthCar myCar = new SixthCar("포르쉐");
		SixthCar yourCar = new SixthCar("페라리");
		
		myCar.run();
		yourCar.run();
		
	}
	
	public void print(String msg) {
		System.out.println(msg);
	}
	
}
