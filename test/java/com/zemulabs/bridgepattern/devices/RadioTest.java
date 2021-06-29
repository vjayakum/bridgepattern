package com.zemulabs.bridgepattern.devices;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class RadioTest {
	
	Radio radio = new Radio();
	
    @Test
    public void shouldSetVolumeLimit()
    {
    	radio.setVolume(120);
        assertTrue( (radio.getVolume() == 100));
    }
    
    @Test
    public void shouldSetVolumeLow() {
    	radio.setVolume(-10);
    	assertTrue( (radio.getVolume() >= 0));
    }
    
    @Test
    public void shouldBeOn() {
    	radio.enable();
    	assertTrue(radio.isEnabled());
    }
    
    @Test
    public void shouldSetChannel()
    {
    	radio.setChannel(10);
    	assertTrue( radio.getChannel() == 10);
    }
    
    @Test
    public void shouldPrintStatus() {
    	radio.printStatus();
    	assertTrue( true );
    }

}
