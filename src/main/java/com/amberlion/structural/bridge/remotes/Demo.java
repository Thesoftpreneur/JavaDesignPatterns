package com.amberlion.structural.bridge.remotes;

import com.amberlion.structural.bridge.remotes.devices.Device;
import com.amberlion.structural.bridge.remotes.devices.Radio;
import com.amberlion.structural.bridge.remotes.devices.Tv;
import com.amberlion.structural.bridge.remotes.remotes.AdvancedRemote;
import com.amberlion.structural.bridge.remotes.remotes.BasicRemote;

public class Demo {
    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}