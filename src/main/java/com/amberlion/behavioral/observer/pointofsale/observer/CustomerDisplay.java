package com.amberlion.behavioral.observer.pointofsale.observer;

public class CustomerDisplay implements Observer {

    @Override
    public void update(String str) {
        System.out.println("[CustomerDisplay] " + str);
    }
}
