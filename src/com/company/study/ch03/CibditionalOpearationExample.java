package com.company.study.ch03;

public class CibditionalOpearationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int score = 85;
		char grade = score > 90 ? 'A' : 'B' ;
		
		System.out.println("grade:"+ grade);
		System.out.println("______________");
		
		
		if (grade > 90) {
			System.out.println("grade: A");
			
		} else {
			System.out.println("grade:B");
		}

	}

}
