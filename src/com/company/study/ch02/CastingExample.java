package com.company.study.ch02;

public class CastingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//강제 형변환 : casting : (원하는 형) 변수명 
		
		double doubleValue = 1234567;
		System.out.println("doubleValue:" + doubleValue);
		
		double doubleValue2= 1234567891;
		System.out.println("doubleValue2:"+ doubleValue2);
		
		float floatValue = (float) doubleValue;
		System.out.println("floatValue:" + floatValue);
		
		long longValue = (long) floatValue;
		System.out.println("longValue:" + longValue);
		
		int intValue = (int) longValue;
		System.out.println("intValue:" + intValue);
		
		short shortValue = (short) intValue;
		System.out.println("shortValue:" + shortValue);
		
		byte byteValue = (byte) shortValue;
		System.out.println("byteValue:" + byteValue);
		
		
		
		// int 를 string 으로 변환
		
		String stringValue = String.valueOf(intValue);
		System.out.println("srtingValue:" + stringValue);
		
		// string 을 int 로 변환
		int intValue2 = Integer.parseInt(stringValue);
		System.out.println("intValue2:" + intValue2);
		
		
		
		// int 를 string 으로 변환
		
		int in_1 = 123;
		String str_1 = Integer.toString(in_1);
		System.out.println(str_1);
		
		
		
		// string 을 int 로 변환
		
		String str_2 = "123";
		int in_2 = Integer.parseInt(str_2);
		System.out.println(in_2);
		
		
		
		
		
		
		
		
		
	}

}
