package com.urdomain.lecture.ch05;

public class Exc {

	public static void main(String[] args) {
		
//		2~9까지 정수형 배열 변수 2개를 만들고
//		for 문을 사용하여 구구단을 출력하시오..
		
		int[] arr1 = {2,3,4,5,6,7,8,9};
		int[] arr2 = {1,2,3,4,5,6,7,8,9};
		
		int k = 0;
		
		System.out.println("score.length: " + arr1.length);
		System.out.println("score.length: " + arr2.length);
		
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr2.length; j++) {
				k = arr1[i]*arr2[j];

				System.out.println(arr1[i] + "x" + arr2[j] + "=" + k);
			}
			
			System.out.println();
		}
		
		
		
	}

}
