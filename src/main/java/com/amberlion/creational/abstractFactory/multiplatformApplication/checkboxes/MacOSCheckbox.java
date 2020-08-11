package com.amberlion.creational.abstractFactory.multiplatformApplication.checkboxes;

public class MacOSCheckbox implements Checkbox {

    @Override
    public void paint() {
        System.out.println("You have created MacOSCheckbox.");
    }

    @Override
    public String getOS() {
        return "macOS";
    }
}
