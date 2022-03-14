package com.urdomain.lecture.ch13;

public class ProductExample {

	public static void main(String[] args) {
		Product<String, Integer> product = new Product<>(); // 뒤의 <>는 앞의 <>를 따라가서 생략이 가능하다. 써도되긴함		
		
		product.setKind("벤츠");
		product.setModel(400);
		
		System.out.println("내가 선물받은 차는: " + product.getKind() + ": " + product.getModel() + "입니다.");

		
		
		Product<Tv, String> product2 = new Product<>();
		//  product2 -> setKind -> field 로 대입

		Tv tv = new Tv();
		
		product2.setKind(tv);
		product2.setModel("OLED TV");

		Tv rtTv = product2.getKind();
		String rtString = product2.getModel();
		
		System.out.println(rtTv + " : " + rtString);
		
		
		
		
		Product<Car, String> product3 = new Product<>();
		
		Car car = new Car();
		
		product3.setKind(car);
		product3.setModel("아반떼");
		
		Car rtCar = product3.getKind();
		String rtString2 = product3.getModel();
		
		System.out.println(rtCar + " : " + rtString2);
	}

}
