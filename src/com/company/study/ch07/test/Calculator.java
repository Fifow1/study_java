package com.company.study.ch07.test;
public class Calculator {
	double result(double param){
		double result;
		System.out.println("Calculator 객체의 원면적 구하는 프로그램 실행");
		result = param * param * Constants.PAI_1;
		return result;
	}
}
