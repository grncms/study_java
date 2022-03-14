package minsujava.bj02;

import java.util.Scanner;

public class Main01 {

	public static void main(String[] args) {
		
		Scanner bg = new Scanner(System.in);
		
		int a = bg.nextInt();
		int b = bg.nextInt();
		
		if(a > b) {
			System.out.println(">");
		} else if (a < b) {
			System.out.println("<");
		} else {
			System.out.println("==");
		}
		
	}

}