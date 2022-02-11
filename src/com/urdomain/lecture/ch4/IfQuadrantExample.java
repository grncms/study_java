package com.urdomain.lecture.ch4;

public class IfQuadrantExample {

	public static void main(String[] args) {
		
		int a = 12;
		int b = 5;
		
		String Quad = "";
		
		if (a > 0) {
			if (b > 0) {
				Quad = "1사분면";
			} else if(b < 0) {
				Quad = "4사분면";
			}
		} else if (a < 0) {
			if (b > 0) { 
				Quad = "2사분면";
			} else if (b < 0) {
				Quad = "3사분면";
			}
		}
		

		System.out.println("Quad = " + Quad);
		
	}

}
