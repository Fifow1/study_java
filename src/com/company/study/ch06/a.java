package com.company.study.ch06;

public class a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		b b0 = new b();
		b b1 = new b("김태희1");
		b b2 = new b("김태희2", 5);
		b b3 = new b("김태희3", false);
		b b4 = new b("김태희4", 10, false);

		b0.say();
		b1.say();
		b2.say();
		b3.say();
		b4.say();

	}

}
