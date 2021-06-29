package com.zemulabs.bridgepattern;

import com.zemulabs.bridgepattern.devices.Device;
import com.zemulabs.bridgepattern.devices.Radio;
import com.zemulabs.bridgepattern.devices.TV;
import com.zemulabs.bridgepattern.remotes.AdvancedRemote;
import com.zemulabs.bridgepattern.remotes.BasicRemote;

public class Demo {

	public static void main(String[] args) {

		testDevice(new TV());
		testDevice(new Radio());

	}
	
	public static void testDevice(Device device) {
		System.out.println("Test with basic remote");
		BasicRemote basicRemote = new BasicRemote(device);
		basicRemote.power();
		device.printStatus();
		
		System.out.println("Test with Advanced Remote");
		AdvancedRemote advancedRemote = new AdvancedRemote(device);
		advancedRemote.power();
		advancedRemote.mute();
		device.printStatus();
	}

}
