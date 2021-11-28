package com.amberlion.behavioral.observer.pointofsale.observer;

public class CashierDisplay extends Observer {

    @Override
    public void update(String str) {
        System.out.println("[CashierDisplay] " + str);
    }
}
