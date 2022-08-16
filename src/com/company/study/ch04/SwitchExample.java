package com.company.study.ch04;

public class SwitchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 7;
		
		switch(num) {
			case 95:
				System.out.println("1번이 나왔습니다.");
				break;
			case 2:
				System.out.println("2번이 나왔습니다.");
				break;
			default:
				System.out.println("1도 2도 아닌 정수가 나왔습니다.");
				break;
		}
		
		
		String position = "사원";
		
		switch (position) {
		case "사원": //)
				System.out.println("연봉은 1000원입니다");
			break;
		case "대리":
			System.out.println("연봉은 1000원입니다");
		break;
		case "과장":
			System.out.println("연봉은 1000원입니다");
		break;
		case "부장":
			System.out.println("연봉은 1000원입니다");
		break;
		case "사장":
			System.out.println("연봉은 1000원입니다");
		break;
		default:
			System.out.println("연봉은 없습니다.");
			break;
		}
	}

}
