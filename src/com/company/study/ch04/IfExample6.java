package com.company.study.ch04;

public class IfExample6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int 타입의 변수를 1개 선언하고
		// 짝수인지 홀수인지 판단하여 결과를 출력하는 프로그램을 작성하시오.
		int a = 0;
		int b = a%2;
		
		if (b == 1) {
			System.out.println("홀수");
		} else if (b==0) {
			System.out.println("짝수");
		} else {
			System.out.println("d");
			
		}
		System.out.println(b);
	}

}
