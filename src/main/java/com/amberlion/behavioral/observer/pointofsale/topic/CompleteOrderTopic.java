package com.amberlion.behavioral.observer.pointofsale.topic;

import com.amberlion.behavioral.observer.pointofsale.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class CompleteOrderTopic implements Topic {

    List<Observer> completedOrderObservers = new ArrayList<>();

    @Override
    public void register(Observer o) {
        completedOrderObservers.add(o);
    }

    @Override
    public void notifyObservers(String line) {
        for(Observer o: completedOrderObservers) {
            o.update(line);
        }
    }
}
