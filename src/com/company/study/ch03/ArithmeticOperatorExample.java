package com.company.study.ch03;

public class ArithmeticOperatorExample {
	
	public static void main (String[] args) {
		
		
		int a = 5;
		int b = 2;
		
		int result1 = a + b;
		int result2 = a - b;
		int result3 = a * b;
		int result4 = a / b;
		int result5 = a % b;
		
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
		
		double result6 = a/b;
		System.out.println(result6);
		
		double result7 = (double)a/b;
		System.out.println(result7);
		System.out.println("Hello World!");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		good(60 , 70 , 85 , 90 , 45);
		good(50 , 75 , 70 , 60 , 70);
		good(55 , 60 , 64 , 58 , 90);
		good(80 , 70 , 63 , 88 , 78);
		
		
	}

	public static void good( int a, int b, int c , int d , int e ) {
		
		System.out.println("평균:"+ (double) (a+b+c+d+e) / 5 );
		
		
	}
	
}


