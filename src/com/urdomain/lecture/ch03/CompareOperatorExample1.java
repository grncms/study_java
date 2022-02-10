package com.urdomain.lecture.ch03;

public class CompareOperatorExample1 {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 10;
		
		boolean result1 = (num1 == num2);
		boolean result2 = (num1 != num2);
		boolean result3 = (num1 <= num2);
		
		System.out.println("result = " + result1);	//	true
		System.out.println("result = " + result2);	//	false
		System.out.println("result = " + result3);	//	true
		
		char char1 = 'A';
		char char2 = 'B';
		boolean result4 = (char1 < char2);
		System.out.println("result4 = " + result4); //	true
		
	}

}
