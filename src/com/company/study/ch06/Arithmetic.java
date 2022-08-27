package com.company.study.ch06;


public class Arithmetic {
	
	int result = 0;
	
	public int plus(int a, int b) {
		result = a + b;
		return result;
	}
	
	public int minus(int a, int b) {
		result = a - b;
		return result;
	}
	
	public int multiply(int a, int b) {
		result = a * b;
		return result;
	}
	
	public int divide(int a, int b) {
		result = a / b;
		return result;
	}
	
	public int print(String c) {
		if(c == "plus") {
			Object plus;
			System.out.println(result);
		}else if(c == "mius"){
			Object minus;
			System.out.println(result);
		}else if(c == "multiply"){
			Object multiply;
			System.out.println(result);
		}else if(c == "divide"){
			Object divide;
			System.out.println(result);
		}
		return result;
	}
	
	
	
}
	
	

