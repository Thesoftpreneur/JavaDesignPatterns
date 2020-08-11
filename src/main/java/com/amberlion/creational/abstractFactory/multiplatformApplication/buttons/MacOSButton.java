package com.amberlion.creational.abstractFactory.multiplatformApplication.buttons;

public class MacOSButton implements Button {

    @Override
    public void paint() {
        System.out.println("You have created MacOSButton.");
    }

    @Override
    public String getOS() {
        return "macOS";
    }
}
