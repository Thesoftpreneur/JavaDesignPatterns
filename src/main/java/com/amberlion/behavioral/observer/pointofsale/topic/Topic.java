package com.amberlion.behavioral.observer.pointofsale.topic;

import com.amberlion.behavioral.observer.pointofsale.observer.Observer;

public interface Topic {
    public void register(Observer obj);
    public void notifyObservers(String line);
}

