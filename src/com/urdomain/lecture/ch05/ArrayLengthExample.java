package com.urdomain.lecture.ch05;

public class ArrayLengthExample {

	public static void main(String[] args) {
		
		int[] score = {83,90,87,99};
		
		int sum = 0;
		
		System.out.println("score.length: " + score.length);	// score.length = 나중에 알어~ 응
		
//		for(int i=0; i<5; i++) {
//			sum += score[i];
		for(int i=0; i<score.length; i++) {
				sum += score[i];
		}
		
		System.out.println("총합은 : " + sum);
	}

}
