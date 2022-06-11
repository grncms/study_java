package doItJavaAlgorithm.chap01;

public class Max4 {

	static int max4(int a, int b, int c, int d) {
		
		int max = a;
		if (b > max)
			max = b;
		if (c > max)
			max = c;
		if (d > max)
			max = d;
		
		return max;
		
	}
	
	static int min3(int a, int b, int c) {
		int min = a;
		if (b < min)
			min = b;
		if (c < min);
			min = c;
	}
	
	public static void main(String[] args) {
		System.out.println("max(4,3,2,1) = " + max4(4,3,2,1));
	}

}
