package com.zemulabs.bridgepattern.remotes;

import com.zemulabs.bridgepattern.devices.Device;

public class BasicRemote implements Remote {

	protected Device device;
	
	private final int VOLUME_STEP = 10;
	
	public BasicRemote() {
		
	}
	
	public BasicRemote(Device device) {
		this.device = device;
	}
	
	@Override
	public void power() {
		System.out.println("Basic Remote : power toggle " + !this.device.isEnabled());
		if (this.device.isEnabled()) {
			this.device.disable();
		} else {
			this.device.enable();
		}
	}

	@Override
	public void volumeDown() {
		System.out.println("Basic Remote : Volume down");
		this.device.setVolume(this.device.getVolume() - VOLUME_STEP);
	}

	@Override
	public void volumeUp() {
		System.out.println("Basic Remote : Volume up");
		this.device.setVolume(this.device.getVolume() + VOLUME_STEP);
	}

	@Override
	public void channelDown() {
		System.out.println("Basic Remote : Channel down");
		this.device.setChannel(this.device.getChannel() - 1);
	}

	@Override
	public void channelUp() {
		System.out.println("Basic Remote : Channel up");
		this.device.setChannel(this.device.getChannel() + 1);		
	}

}
