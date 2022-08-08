package com.company.study.ch04;

public class ifExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int score = 58;
		
		
		if (score >= 90) {
			if(score<=92) {
				System.out.println("A-");
			} else if (score>=98) {
				System.out.println("A+");
			} else {
				System.out.println("A");
			}
		} else if (80 <= score)	{
			if(score<=82) {
				System.out.println("B-");
			} else if (score>=88) {
				System.out.println("B+");
			} else {
				System.out.println("B");
			}
		}  else if (70 <= score)	{
			if(score<=72) {
				System.out.println("C-");
			} else if (score>=78) {
				System.out.println("C+");
			} else {
				System.out.println("C");
			}
		}  else if (60 <= score)	{
			if(score<=62) {
				System.out.println("D-");
			} else if (score>=68) {
				System.out.println("D+");
			} else {
				System.out.println("D");
			}
		} else if (50 <= score)	{
			if(score<=52) {
				System.out.println("E-");
			} else if (score>=58) {
				System.out.println("E+");
			} else {
				System.out.println("E");
			}
		} else {
			System.out.println("F");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
