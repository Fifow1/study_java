package com.company.study.ch04;

public class IfExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// int 타입의 변수를 2개 선언하고
// 두 정수가 주어졌을 때 사분면 어디에 해당되는지 출력하는 프로그랩을 작성하시오
		
		int x = 1;
		int y = 2;
		
		if(x>0 && y>0) {
			System.out.println("1사분면");
		} else if (x<0 && y>0) {
			System.out.println("2사분면");
		} else if (x<0 && y<0) {
			System.out.println("제 3사분면");
		} else if (x>0 && y<0){
			System.out.println("제4사분면");
		} else if (x==0 & y!=0) {
			System.out.println("x축");
		} else if (x!=0 & y==0) {
			System.out.println("y축");
		} else {
			// a==0 b==0
			System.out.println("원점");
		}
//		x축 위에, y축 위에 원점
		
		
		
		
		
	}

}
