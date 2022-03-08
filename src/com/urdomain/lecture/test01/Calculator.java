package com.urdomain.lecture.test01;

public class Calculator {

	
	public Double CircleArea(int r) {
		Constants constants = new Constants();
		
		Double area = r * r * constants.PAI_1;
		
		return area;
	}
	
}
