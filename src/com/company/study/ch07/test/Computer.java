package com.company.study.ch07.test;
public class Computer extends Calculator {
	@Override
	double result (double param) {
		System.out.println("Computer 객체의 원면적 구하는 프로그램 실행");
		double result;
		result = param * param * Constants.PAI_2;
		return result;
	}
}
