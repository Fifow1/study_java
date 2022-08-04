package com.company.study.ch03;

public class LogicalOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	//  && = & : and : 논리곱 : 연산 참 참 참, 나머지 폴스
	//  || = | : or : 논리합 : 연산 참 폴스 참, 폴스 참 참, 참 참 참, 폴스 폴스 폴스
	//  ^^

		
		
		int a =65;
		
		
		boolean result = (a>=65);
		System.out.println("result" + result);
		
		boolean result2 = (a<=90);
		System.out.println("result" + result2);
		
		
		
		
		if(a >= 65 & a <= 90 ) {
			System.out.println("65봗 크거나 같고 90보다 작습니다.");
		}
		
		if(a >= 65 && a <= 90 ) {
			System.out.println("65봗 크거나 같고 90보다 작습니다.");
		}
		
		
		
		System.out.println("_________________________");
		
		
		
		if(a >= 65 | a <= 90 ) {
			System.out.println("둘다참");
		}
		if(a >= 66 | a <= 90 ) {
			System.out.println("한개만 참");
		}
		if(a >= 66 | a <= 50 ) {
			System.out.println("둘다 폴스");
		}
		if(a >= 65 || a <= 90 ) {
			System.out.println("둘다참");
		}
		if(a >= 66 || a <= 90 ) {
			System.out.println("한개만 참");
		}
		if(a >= 66 || a <= 50 ) {
			System.out.println("둘다 폴스");
		}
		
		
		System.out.println("_________________________");
		
		
		if(a >= 65 ^ a <= 90 ) {
			System.out.println(" 참 + 참 = 폴스 (안보임)");
		}
		if(a >= 66 ^ a <= 90 ) {
			System.out.println("하나만참");
		}
		if(a >= 66 ^ a <= 50 ) {
			System.out.println("폴스 + 폴스 =참 (안보임)");
		}
		
		
	}

}
