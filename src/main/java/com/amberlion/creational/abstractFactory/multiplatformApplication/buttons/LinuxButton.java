package com.amberlion.creational.abstractFactory.multiplatformApplication.buttons;

public class LinuxButton implements Button {
    @Override
    public void paint() {
        System.out.println("You have created LinuxButton.");
    }
}
