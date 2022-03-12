package minsujava01;

import java.util.Scanner;

public class Main13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		sc.close();
		
		System.out.println(a*d);
		System.out.println(a*c);
		System.out.println(a*b);
		System.out.println(a*d*100 + a*c*10 + a*b);
	}

}
