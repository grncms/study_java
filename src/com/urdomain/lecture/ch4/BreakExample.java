package com.urdomain.lecture.ch4;

public class BreakExample {

	public static void main(String[] args) {

		while(true) {
			int num = (int) ((Math.random()*6) + 1);
			System.out.println(num);
			if(num == 6) {
				// 6이나오면 중단한다.
				break;
			}
		}
		System.out.println("process ended!");
	}

}
