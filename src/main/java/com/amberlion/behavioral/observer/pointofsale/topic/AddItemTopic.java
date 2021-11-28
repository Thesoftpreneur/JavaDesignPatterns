package com.amberlion.behavioral.observer.pointofsale.topic;

import com.amberlion.behavioral.observer.pointofsale.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class AddItemTopic implements Topic {

    List<Observer> addItemObservers = new ArrayList();

    @Override
    public void register(Observer o) {
        addItemObservers.add(o);
    }

    @Override
    public void notifyObservers(String line) {
        for(Observer o: addItemObservers) {
            o.update(line);
        }
    }
}
