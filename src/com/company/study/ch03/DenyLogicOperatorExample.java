package com.company.study.ch03;

public class DenyLogicOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		boolean a = true;
		System.out.println(a);

		
		a = !a;
		System.out.println(a);
		
		
		a =!a;
		System.out.println(a);
		
		int j = 3;
		
		if (!(j==3))	{
			System.out.println("3이아님");
		} else {
			System.out.println("3임");
		}
	}

	
	
}
