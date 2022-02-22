package com.urdomain.lecture.ch06.exc;

public class ThirdCar {
	// field
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	
	//method( 생성자)
	
	ThirdCar() {
		
	}
	
	ThirdCar(String model){
		this(model, null, 0);
	}

	ThirdCar(String model, String color){
		this(model, color, 0);
	}
	
	ThirdCar(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		
	}

}
