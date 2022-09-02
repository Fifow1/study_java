package com.company.study.ch07.test;
public class ComputerExample {
	public static void main(String[] args) {
		double param = 3.0;
		System.out.println("원의 반지름: " + param);
		Calculator calculator = new Calculator();
		System.out.println("원면적: " + calculator.result(param));
		Computer computer = new Computer();
		System.out.println("원면적: " + computer.result(param));
	}
}
	