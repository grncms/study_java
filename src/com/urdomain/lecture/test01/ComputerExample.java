package com.urdomain.lecture.test01;

public class ComputerExample {

	public static void main(String[] args) {
		
		Calculator calculator = new Calculator();
		Computer computer = new Computer();
		
			int r = 7;
		
			System.out.println("원의 반지름 : " + r);
			System.out.println();

			System.out.println("Calculator 객체의 원면적 구하는 프로그램 실행");
			System.out.println("원면적 : " + calculator.CircleArea(r));
			System.out.println();

			System.out.println("Computer 객체의 원면적 구하는 프로그램 실행");
			System.out.println("원면적 : " + computer.CircleArea(r));
	}

}
