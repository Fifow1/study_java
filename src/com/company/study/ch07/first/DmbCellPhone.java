package com.company.study.ch07.first;

public class DmbCellPhone extends CellPhone{
	
	int channel;
	
	DmbCellPhone(){
	}
	
	DmbCellPhone(String model,String color, int a){
		this.model = model;
		this.color = color;
		this.channel= a ;
	}
	
	void turnOnDmb() {
		System.out.println("채널 킴");
	}
	void turnOffDmb() {
		System.out.println("채널 끔");
	}
	void changeChannelDmb(int a) {
		this.channel = channel;
		System.out.println("채널바꿈");
	}
}



