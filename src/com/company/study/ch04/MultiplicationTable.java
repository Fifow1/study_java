package com.company.study.ch04;

public class MultiplicationTable {

	public static void main(String[] args) {
		
		for(int i=1 ; i<=9 ; i++) {
			System.out.println("2 * " + i + "=" + (2*i));
		}
	
		for(int k = 2 ; k <= 9 ; k++) {
			for (int j=1; j<=9 ; j++) {
				System.out.println(k + "*" + j + "=" + (k*j));
			}							
		}			
		
	}

}
