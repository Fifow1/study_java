package com.company.study.ch06;

public class CarSecondExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CarSecond carSecond = new CarSecond();
		String color;
		
		CarSecond carSecond2 = new CarSecond("blue");
		CarSecond carSecond3 = new CarSecond("white",300);
		String color2 = "Red";
		
		
		System.out.println(carSecond2.color);
		System.out.println(carSecond2.cc);
		System.out.println(carSecond3.color);
		System.out.println(carSecond3.cc);
	}

}
