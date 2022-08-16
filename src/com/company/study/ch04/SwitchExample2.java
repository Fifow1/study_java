package com.company.study.ch04;

public class SwitchExample2 {

	public static void main(String[] arges) {
		
		String position = "사원";
		double a =0.0;
		int cost = 10000;
		
		switch (position) {
		case "일반": 
			a = cost*(1-0.05);
			System.out.println("정가가"+cost+"일반 등급의 할인가는:"+(int)a);
			break;
		case "브론즈":
			a = cost*(1-0.1);
			System.out.println("정가가"+cost+"일반 등급의 할인가는:"+(int)a);
		break;
		case "실버":
			a = cost*(1-0.15);
			System.out.println("정가가"+cost+"일반 등급의 할인가는:"+(int)a);
		break;
		case "골드":
			a = cost*(1-0.2);
			System.out.println("정가가"+cost+"일반 등급의 할인가는:"+(int)a);
		break;
		case "플레티넘":
			a = cost*(1-0.027);
			System.out.println("정가가"+cost+"일반 등급의 할인가는:"+(int)a);
		break;
		default:
			System.out.println("오류");
			break;
		}
	}
}

