package com.company.study.ch05;

public class EnumWeekExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Week abc ;
		abc = Week.MONDAY;
		
		System.out.println(Week.FRIDAY);
		
	// String name = abc;
		String name = abc.name();
		System.out.println(name);
		
		int ordinal = abc.ordinal();
		System.out.println(ordinal);

		abc = Week.THURSDAY;
		
//		int result1 = abc.compareTo(xyz);
//		int result2 = xyz.compareTo(abc);
		
//		System.out.println(result1);
//		System.out.println(result2);
		
		Week[] days = Week.values();
		
		int index = 0;
		for(Week day: days) {
			System.out.println(index+": day: "+day);
			index ++;
		}
	}

}
