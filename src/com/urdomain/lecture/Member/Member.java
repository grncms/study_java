package com.urdomain.lecture.Member;

import java.util.ArrayList;
import java.util.List;

public class Member {
	private String name;
	private String id;
	private String password;
	private String childrenNum;
	
	public static void main(String[] args) {
		Member test = new Member();
		
		test.id = "test";
		test.password = "test";
		test.name = "test";
		test.childrenNum = "test";
		
		List<Member> list = new ArrayList<Member>();
		
		for(int i=0; i<10; i++) {
			list.add(test);
		}
		
		for(Member mee : list) {
			System.out.println(mee.id);
		}
	}
}
