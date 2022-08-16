package com.company.study.ch04;

import java.util.Random;

public class ifExample3 {

	public static void main(String[] args, int bound) {
		// TODO Auto-generated method stub
// int 타입의 변수를 2개 선언하고 
// 두 정수가 주어졌을 때 두 정수를 비교하여 결과를 나타내시오
		
		int a = 3;
		int b = 5;
		
		if (a>b) {
			System.out.println("a가 더 큼");
		} else if (a<b) {
			System.out.println("b가 더 큼");
		} else {
			System.out.println("같음");
		}
		
		Random randam = new Random();
		
		System.out.println(Math.max(a,b));
		String str = "1";
		int i = Integer.parseInt(str);
		String l = String.valueOf(i);
	}

}

