package doItJavaAlgorithm.chap01;

public class Med3x {

	static int med3(int a, int b, int c) {
		
		if((b >= a && c <= a) || (b <= a && c >= a))
			return a;
		else if ((a > b && c < b) || (a < b && c > b))
			return b;
		return c;
	}
	
	public static void main(String[] args) {

	}

}
