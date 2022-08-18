package com.company.study.ch05;

public class ArrayInArrayExanple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int [][] score = {{99,88,55},{55,77,66},{55,55,44},{55,55,44},{55,55,77}};
		int []score1 = {99,88,55};
		String[] name = {"한찬구","장동건","고소영","박태환","싸이"};
		
		
		
		
		
		
		
		
		double result = 0.0 ;
		double result1 = 0.0 ;
		
		
		//scores.length
		for(int a = 0; a < 5; a++) {
			for(int b = 0; b < 3; b++) {
				result += score[a][b];
			}
			System.out.println(name[a]+"의 평균점수"+result/3);
			result = 0;
		}
		
		
		System.out.println("___________________");
		
		
		
		
		for(int a = 0; a < 3; a++) {
			result1 = 0;
			for(int b =0; b<5; b++) {
				result1 += score[b][a];
			}
			System.out.println(result1/5);
		}
	}
}
	
		
		
//		String[] name = {"한찬구","장동건","고소영","박태환","싸이"};
//		String[] subject = {"국어","영어","수학"};
		
		
		//1 개인의 평균
		/*
		for(int i=0; i<5; i++) {
			int sum=0;
			for(int j=0; j<3; j++) {
				sum +=scores[i][j];
			}
			System.out.println(name[i]+"의 평균 점수는: "+((double)sum/3));
		}
		System.out.println("------------------------------");
		*/
//		for(int i=0; i<scores.length; i++) {
//			int sum=0;
//			for(int j=0; j<scores[i].length; j++) {
//				sum +=scores[i][j];
//			}
//			System.out.println(name[i]+"의 평균 점수는: "+((double)sum/3));
//			System.out.println(name[i]+"의 평균 점수는: "+((double)sum/scores[i].length));
//		}
		
//		System.out.println("------------------------------");
		//2 과목별 평균
//		for(int j=0; j<3; j++) {
//			int sum=0;
//			for(int i=0; i<5; i++) {
//				sum +=scores[i][j];
//			}
//			System.out.println(subject[j]+" 과목의 평균 점수는: "+((double)sum/5));
//		}
//		
		
//	}

// }

