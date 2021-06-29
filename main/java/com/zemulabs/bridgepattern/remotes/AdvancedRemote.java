package com.zemulabs.bridgepattern.remotes;

import com.zemulabs.bridgepattern.devices.Device;

public class AdvancedRemote extends BasicRemote {
	
	public AdvancedRemote(Device device) {
		super(device);
	}
	
	public void mute() {
		System.out.println("I am Advanced Remote");
		this.device.setVolume(0);
	}

}
