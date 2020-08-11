package com.amberlion.creational.abstractFactory.multiplatformApplication.buttons;

public class WindowsButton implements Button {

    @Override
    public void paint() {
        System.out.println("You have created WindowsButton.");
    }

    @Override
    public String getOS() {
        return "windows";
    }
}
