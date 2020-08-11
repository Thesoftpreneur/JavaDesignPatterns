package com.amberlion.creational.abstractFactory.multiplatformApplication.checkboxes;

public class LinuxCheckBox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("You have created LinuxCheckbox.");
    }
}
