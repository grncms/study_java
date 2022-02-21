package com.urdomain.lecture.ch06;

public class CarExample {

	public static void main(String[] args) {
			
		Car car = new Car();	//	Car() 생성자 = 함수이다. , new : 연산자
		
		
		Student student = new student();
		int a = 1;
		
		
//		객체 접근 연산자(car뒤의 .)를 사용하여 car 객체변수의 값을 참조 
		System.out.println("Company: " + car.company);
		System.out.println("Model: " + car.model);
		System.out.println("Color: " + car.color);
		System.out.println("MaxSpeed: " + car.maxSpeed);
		
		System.out.println("Speed: " + car.speed);
		
		car.speed = 100;
		System.out.println("Speed: " + car.speed);
		System.out.println();
		
		exceedSpeed(car.maxSpeed, car.speed);
		
	}
	
	public static void exceedSpeed(int maxSpeed, int speed) {		// 스피드가 맥스를 넘었는지
		
		if(maxSpeed > speed) {
			System.out.println("speed 가 maxSpeed보다 낮습니다.");
		} else if(maxSpeed < speed) {
			System.out.println("speed 가 maxSpeed보다 높습니다.");
		} else {
			System.out.println("speed 가 maxSpeed 가 같습니다.");
		}
		
		
	}
	
}