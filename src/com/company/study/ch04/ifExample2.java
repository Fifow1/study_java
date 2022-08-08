package com.company.study.ch04;

public class ifExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String tier = "실버";
		int price = 10000 ;
		
		if(tier=="일반") {
			System.out.println(price -(price*0.05));
		} else if (tier=="브론즈") {
			System.out.println(price-(price*0.1));
		} else if (tier=="실버") {
			System.out.println(price-(price*0.15));
		} else if (tier=="골드") {
			System.out.println(price-(price*0.2));
		} else {
			System.out.println(price-(price*0.27));
		}
		
		
	}

}

