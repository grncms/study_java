package com.urdomain.lecture.ch4;

public class SwitchExample {

	public static void main(String[] args) {
		
	
		int num1 = (int) (Math.random() * (6 - 1 + 1) + 1);
		int num2 = (int) (Math.random() * (6 - 1 + 1) + 1);
		int num3 = num1 + num2;
		
		switch (num3) {

		case 1:
			System.out.println("2");
			break;
		case 2:
			System.out.println("3");
			break;
		case 3:
			System.out.println("4");
			break;
		case 4:
			System.out.println("5");
			break;
		case 5:
			System.out.println("6");
			break;
		case 6:
			System.out.println("7");
			break;
		case 7:
			System.out.println("8");
			break;
		case 8:
			System.out.println("9");
			break;
		case 9:
			System.out.println("10");
			break;
		case 10:
			System.out.println("11");
			break;
		default:
			System.out.println("12");
			break;
		}
	}
}

//		int num = 2;

//		Math.random() : 0.0~1.0에 가까운 double 형 값 보내줌
//		int num = Math.random() * (max - min +1) + min;

//		double num = Math.random();
//		System.out.println(num);

/*		int num = (int) (Math.random() * (6 - 1 + 1) + 1);

		switch (num) {

			case 1:
				System.out.println("1번");
				break;
			case 2:
				System.out.println("2번");
				break;
			case 3:
				System.out.println("3번");
				break;
			case 4:
				System.out.println("4번");
				break;
			case 5:
				System.out.println("5번");
				break;
			default:
				System.out.println("6번");
				break;
		}
		
 */

//			첫번째 주사위는 몇번입니다.
//			두번째 주사위는 몇번입니다.
//			두수의 합은 얼마 입니다.