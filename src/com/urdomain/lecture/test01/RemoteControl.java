package com.urdomain.lecture.test01;

public interface RemoteControl {
	
	//상수
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//추상메소드
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
	//디폴트 메소드
	public default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
		} else {
			System.out.println("무음 해제합니다.");
		}
	}
	
	//정적 메소드
	public static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
}