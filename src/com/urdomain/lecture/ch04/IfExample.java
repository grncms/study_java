package com.urdomain.lecture.ch04;

public class IfExample {

	public static void main(String[] args) {

		int score = 93;
		
		if(score > 90) {
			System.out.println("점수가 90 보다 큽니다.");
			System.out.println("등급은 a입니다.");
		}
		
		if(score < 90) {
			System.out.println("점수가 90 보다 작습니다.");
			System.out.println("등급은 b입니다.");
		}
		
	}

}
