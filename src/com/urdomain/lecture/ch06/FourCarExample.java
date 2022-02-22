package com.urdomain.lecture.ch06;

public class FourCarExample {

	public static void main(String[] args) {
		
		FourthCar fourthCar = new FourthCar();
		
		fourthCar.setGas(15); 	// Car의 SetGas() 메소드 호출
		
		boolean gasState = fourthCar.isLeftGas();	//Car의 isLeftGas() 메소드 호출
		if(gasState) {
			System.out.println("출발합니다.");
			fourthCar.run();	//car의 run() 메소드 호출
		}
		
		if(fourthCar.isLeftGas()) {	//car의 isLeftGas() 메소드 호출
			System.out.println("gas를 주입할 필요가 없습니다.");
		} else {
			System.out.println("gas를 주입하세요.");
		}
	}

}
