package com.amberlion.behavioral.observer.simpleDressStore.subjects;

import com.amberlion.behavioral.observer.simpleDressStore.observers.Observer;

import java.util.ArrayList;

public class RedDress implements Subject {

    private ArrayList<Observer> subscribers = new ArrayList<>();

    private boolean inStock = true;

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer o) {
        subscribers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        subscribers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(Observer subscriber :subscribers) {
            subscriber.update();
        }
    }
}
