package com.urdomain.lecture.ch04;

public class ContinueExample {

	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			if(i%2 !=0) {	// 홀수면 i ++로 가렴
 				continue;
			}
			System.out.println(i);
		}
	}

}
