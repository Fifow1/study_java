package com.company.study.ch04;

public class ifExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String tier = "실버";
		int pric = 10000 ;
		
		if(tier=="일반") {
			System.out.println(pric -(pric*0.05));
		} else if (tier=="브론즈") {
			System.out.println(pric-(pric*0.1));
		} else if (tier=="실버") {
			System.out.println(pric-(pric*0.015));
		} else if (tier=="골드") {
			System.out.println(pric-(pric*0.2));
		} else {
			System.out.println(pric-(pric*0.27));
		}
		
		
		
		
		int grade =6;
		int cost =12000;
		double a =0.0;
		
		if(grade == 1) {
			 a = cost*(1-0.05);
			System.out.println("정가가"+cost+"일반 등급의 할인가는:"+(int)a);
		} else if (grade == 2) {
			double price = cost*(1-0.1);
			System.out.println(cost);
		} else if (grade == 3) {
			double price = cost*(1-0.15);
			System.out.println(cost);
		} else if (grade == 4) {
			double price = cost*(1-0.2);
			System.out.println(cost);
		} else if (grade == 5) {
			double price = cost*(1-0.027);
			System.out.println(cost);
		} else {
			System.out.println("1~5까지의 grade만 가능합니다.");
		}
	
	} 
	

}

	