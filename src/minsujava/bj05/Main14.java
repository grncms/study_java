package minsujava.bj05;

import java.util.Arrays;
import java.util.Scanner;

public class Main14 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int A = in.nextInt();
		int[] arr = new int[A];
				
			for(int i = 0; i < A; i++) {
				arr[i] = in.nextInt();
			}
			
			Arrays.sort(arr);
			System.out.println(arr[0] + " " + arr[A-1]);
	}

}