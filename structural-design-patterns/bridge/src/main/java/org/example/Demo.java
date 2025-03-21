package org.example;

import org.example.devices.Device;
import org.example.devices.Radio;
import org.example.devices.Tv;
import org.example.remotes.AdvancedRemote;
import org.example.remotes.BasicRemote;

/**
 * CLIENT CODE

 * Remotes act as abstractions, and devices are their implementations.
 * Thanks to the common interfaces, the same remotes can work with
 * different devices and vice versa.
 *
 */
public class Demo {
    public static void main( String[] args ) {
        Tv tv = new Tv();
        Radio radio = new Radio();

        // Let's test the above devices with different remote controllers
        testDevice(tv);
        testDevice(radio);
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        basicRemote.channelUp();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
