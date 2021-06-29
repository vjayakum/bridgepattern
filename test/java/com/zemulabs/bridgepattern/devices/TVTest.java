package com.zemulabs.bridgepattern.devices;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class TVTest {

	private TV tv = new TV();
	
	@Test
	public void shouldTurnOn() {
		tv.enable();
		assertTrue( tv.isEnabled() );
	}
	
	@Test
	public void shouldTurnOff() {
		tv.enable();
		tv.disable();
		assertTrue( !tv.isEnabled());
	}
	
	@Test
	public void shouldSetVolumeMax() {
		tv.setVolume(120);
		assertTrue( tv.getVolume() == 100 );
	}
	
	@Test
	public void shouldSetVolume() {
		tv.setVolume(50);
		assertTrue( tv.getVolume() == 50 );
	}
	
	@Test
	public void shouldSetVolumeMin() {
		tv.setVolume(-10);
		assertTrue( tv.getVolume() == 1);
	}
	
	@Test
	public void shouldSetChannel() {
		tv.setChannel(10);
		assertTrue( tv.getChannel() == 10);
	}
	
	@Test
	public void shouldPrintStatus() {
		tv.printStatus();
		assertTrue(true);
	}
}
