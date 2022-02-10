package com.urdomain.lecture.ch4;

public class IfNestedExample {

	public static void main(String[] args) {

		int score = 60;
		String grade = "";
		
//		if(score >= 90) {
//			if(score >= 95) {
//				grade = "A+";
//			} else {
//				grade = "A";
//			}
		if(score >= 90) {
			if(score >= 95) {
				grade = "A+";
			} if(score >= 90) {
				grade = "A";
			} if(score >= 85) {
				grade = "B+";
			} if(score >= 80) {
				grade = "B";
			} if(score >= 75) {
				grade = "C+";
			} if(score >= 70) {
				grade = "C";
			} if(score >= 65) {
				grade = "D+";
			} if(score >= 60) {
				grade = "D";
			} else {
				grade = "F";
			}
		}
			
//		} else if (score < 90) {
//			grade = "B+"; 
//		} else if (score < 85) {
//			grade = "B"; 
//		} else if (score < 80) {
//			grade = "C+"; 
//		} else if (score < 75) {
//			grade = "C"; 
//		} else if (score < 70) {
//			grade = "D+"; 
//		} else if (score < 65) {
//			grade = "D"; 
//		} else {
//			grade = "F"; 
//		}
		System.out.println("학점 : " + grade);
	}

}
