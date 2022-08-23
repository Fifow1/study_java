package com.company.study.ch06;

public class ArithmeticExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arithmetic arithmetic = new Arithmetic();
		
		int plus = arithmetic.plus(1, 2);
		int minus = arithmetic.minus(2, 1);
		int multiply = arithmetic.multiply(1, 2);
		int divide = arithmetic.divide(1, 2);
		
		
		

		arithmetic.print("plus");
		arithmetic.print("mius");
		arithmetic.print("multiply");
		arithmetic.print("divide");
	}

}
