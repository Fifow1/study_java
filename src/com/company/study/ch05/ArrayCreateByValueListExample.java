package com.company.study.ch05;

public class ArrayCreateByValueListExample {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scoreEnglish;
		int scoreMath;
		
		int[] scoreChemistry = {88,99,45,86,34};
		String[] name = {"장원영","장동건","고소영"};
		
		int result = 0 ;
		
		for(int i=0; i<=4; i++) {
			result +=  scoreChemistry[i];
		}
		
		System.out.println(result/scoreChemistry.length);
		
		
		
		
			
		
		
		
		
		
		
		
	}

}
