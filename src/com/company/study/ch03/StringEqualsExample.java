package com.company.study.ch03;

public class StringEqualsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String a ="함승윤";
		String b ="함승윤";
		String c = new String("함승윤");
		
		
		boolean result1 = (a==b);
		System.out.println(result1);
		
		boolean result2 = (a==c);
		System.out.println(result2);
		
		System.out.println("a.equals(b):"+ a.equals(b)); //==(x) true
		System.out.println("a.equals(c):"+ a.equals(c)); //==(x) true
				
		
		
		
		
		
		
		
	}

}
