package com.urdomain.lecture.ch07;

public class Phone {
	//field
	public String owner;
	
	// 생성자
	public Phone(String owner) {
		this.owner = owner;
	}
	
	//메소드
	public void turnOn() {
		System.out.println(owner + "가 폰 전원을 켭니다.");
	}
	public void turnOff() {
		System.out.println("가 폰 전원을 끕니다.");
	}
}
