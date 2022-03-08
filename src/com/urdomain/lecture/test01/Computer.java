package com.urdomain.lecture.test01;

public class Computer extends Calculator {

	@Override
	public Double CircleArea(int r) {

		Constants constants = new Constants();
		
		return r * r * constants.PAI_2;
	}

	
	
}
