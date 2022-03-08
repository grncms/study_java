package com.urdomain.lecture.ch08;

public class RemoteControlExample {

	public static void main(String[] args) {
		
		Television television = new Television();
		
		television.turnOn();
		television.turnOff();
		
		System.out.println();
		
		//인터페이스를 구현한 클래스는 위에 처럼 일반크랠스 객체 만들듯ㅇㅣ 하면안된다.
		
		// 인터페이스를 구현한 클래스를 사용해얗된다. 할때는
		RemoteControl remoteControl;		// 인터페이스 변수 선언
		remoteControl = new Television();		// 구현객체로 초기화
		
//		RemoteControl remoteControl2 = new television();
		
		remoteControl.turnOn();
		remoteControl.turnOff();
		
	}

}
