package com.company.study.ch04;

public class RandomSum {

	public static void main (String[] args) {
		
		double min = 1.0;
		double max = 45.0;
		int random = (int)((Math.random()*(max-min)) + min);
		System.out.println(random);
		
		
		
	}

}
	