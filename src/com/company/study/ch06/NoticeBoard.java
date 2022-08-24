package com.company.study.ch06;

public class NoticeBoard {
	
	String name = "ㅇ";
	int view = 2;
	boolean use = true;
	
	
	NoticeBoard(){
	}
	
	NoticeBoard(String name){
		this.name = name;
	}
	NoticeBoard(String name, int view ){
		this.name = name;
		this.view = view;
	}
	
	NoticeBoard(String name, boolean use){
		this.name = name;
		this.use = use;
	}
	
	NoticeBoard(String name, int view, boolean use){
		this.name = name;
		this.view = view;
		this.use = use;
	}
	
	
	
}
