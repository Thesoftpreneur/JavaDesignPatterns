package com.amberlion.behavioral.observer.pointofsale.topic;

import com.amberlion.behavioral.observer.pointofsale.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class AddPaymentTopic implements Topic{

    List<Observer> addPaymentObservers = new ArrayList<>();

    @Override
    public void register(Observer o) {
        addPaymentObservers.add(o);
    }

    @Override
    public void notifyObservers(String line) {
        for(Observer o: addPaymentObservers) {
            o.update(line);
        }
    }
}
