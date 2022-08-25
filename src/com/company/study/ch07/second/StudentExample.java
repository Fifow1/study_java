package com.company.study.ch07.second;

public class StudentExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 명시적 생성자를 사용하여 객체를 생성하고
		// 모듈 필드를 출력하시오.
		
		Student student = new Student("d","123-123",1);
		System.out.println(student.name);
		System.out.println(student.ssn);
		System.out.println(student.studentNo);
		
		Student student2 = new Student();
		System.out.println(student2.name);
		System.out.println(student2.ssn);
		System.out.println(student2.studentNo);
		
		

	}

}
