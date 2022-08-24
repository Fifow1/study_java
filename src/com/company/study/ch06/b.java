package com.company.study.ch06;

public class b {
	

	String name = "김초기";
	int view = 0;
	boolean useNy = true;

	b(){
	}
	b(String name){
		this.name = name;
	}
	b(String name, int view){
		this.name = name;
		this.view = view;
	}
	b(String name, boolean useNy){
		this.name = name;
		this.useNy = useNy;
	}
	b(String name, int view, boolean useNy){
		this.name = name;
		this.view = view;
		this.useNy = useNy;
	}
	public void say() {
		System.out.println("이름: "+name+", 조회수: "+view+", 사용여부: "+useNy);
		
	}
}
