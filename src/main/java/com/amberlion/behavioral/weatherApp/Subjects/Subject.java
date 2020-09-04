package com.amberlion.behavioral.weatherApp.Subjects;

import com.amberlion.behavioral.weatherApp.Observers.Observer;

public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
