package com.company.study.ch06;

public class NoticeBoardExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NoticeBoard noticeboard = new NoticeBoard();
		
		System.out.println("이름:"+noticeboard.name);
		System.out.println("조회수:"+noticeboard.view);
		System.out.println("사용여부:"+noticeboard.use);
		System.out.println("__________________");
		
		NoticeBoard noticeboard2 = new NoticeBoard("ㅎㅎ");
		NoticeBoard noticeboard3 = new NoticeBoard("ㅎㅎ",123);
		NoticeBoard noticeboard4 = new NoticeBoard("ㅎㅎ",false);
		NoticeBoard noticeboard5 = new NoticeBoard("ㅎㅎ",123,false);
		
		System.out.println("이름:"+noticeboard2.name);
		System.out.println("__________________");
		System.out.println("이름:"+noticeboard3.name);
		System.out.println("이름:"+noticeboard3.view);
		System.out.println("__________________");
		System.out.println("이름:"+noticeboard4.name);
		System.out.println("이름:"+noticeboard4.use);
		System.out.println("__________________");
		System.out.println("이름:"+noticeboard5.name);
		System.out.println("이름:"+noticeboard5.view);
		System.out.println("이름:"+noticeboard5.use);
		
		

	}

}
