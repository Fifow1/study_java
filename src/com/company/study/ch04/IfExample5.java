package com.company.study.ch04;

public class IfExample5 {

	public static void main (String[] args) {
		// int 타입의 변수를 3개 선언하고
		// 세 정수중에서 최대값 최소값을 구하는 프로그램을 작성하시오
		
		int a = 7;
		int b = 7;
		int c = 7;
		
		if (a>b & a>c) {
			if(b<c) {
				System.out.println("a가 최대 b가 최소");
			} else {
				System.out.println("a가 최대 c가 최소");
			}
		} else if (b>c & b>a) {
			if(a<c) {
				System.out.println("b가 최대 a가 최소");
			} else {
				System.out.println("b가 최대 c가 최소");
			}
		} else if (c>a & c>b) {
			if(a<b) {
				System.out.println("c가 최대 a가 최소");
			} else {
				System.out.println("c가 최대 b가 최소");
			}

		}
		
		
	}
	
}
