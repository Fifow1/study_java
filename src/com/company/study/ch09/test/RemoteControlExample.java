package com.company.study.ch09.test;

import com.company.study.ch08.RemoteControl;
import com.company.study.ch08.Television;

public class RemoteControlExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		
		RemoteControl remoteControl = new Television();	
		
		
		remoteControl.turnOn();
		remoteControl.setMute(true);
		remoteControl.setMute(false);
		remoteControl.setVolume(100);
		RemoteControl.changeBattery();
		remoteControl.turnOff();
		
		
		
		remoteControl.turnOn();
		remoteControl.setMute(true);
		remoteControl.setMute(false);
		remoteControl.setVolume(100);
		RemoteControl.changeBattery();
		remoteControl.turnOff();
		
		
	
		
		
	}

}
