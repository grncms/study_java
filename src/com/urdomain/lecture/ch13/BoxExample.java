package com.urdomain.lecture.ch13;

public class BoxExample {

	public static void main(String[] args) {

		Box<String> box = new Box<String>();
		// Box 객체 중에서 한개 즉 지네릭 타입은 String으로 된 것이다.
		//string T
		box.set("최민수");
		String str = box.get();
		System.out.println("str: " + str);

		System.out.println("");
		
		
		Box<Integer> box2 = new Box<Integer>();
		// t : Integer t;
		box2.set(11);
		int number = box2.get();
		System.out.println("number: " + number);
		
		System.out.println("");
		
		
		Box<Double> box3 = new Box<Double>();
		// t : Integer t;
		box3.set(5.1);
		double number2 = box3.get();
		System.out.println("number: " + number2);
	}

}
