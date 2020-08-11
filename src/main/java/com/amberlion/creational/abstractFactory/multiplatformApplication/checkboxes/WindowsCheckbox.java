package com.amberlion.creational.abstractFactory.multiplatformApplication.checkboxes;

public class WindowsCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("You have created WindowsCheckbox.");
    }
}
