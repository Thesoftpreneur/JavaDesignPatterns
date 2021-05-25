package com.amberlion.behavioral.observer.simpleDressStore.subjects;


import com.amberlion.behavioral.observer.simpleDressStore.observers.Observer;

public interface Subject {
    void addObserver (Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
