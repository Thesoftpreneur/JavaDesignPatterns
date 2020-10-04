package com.amberlion.behavioral.observer.SimpledressStore.observers;

import com.amberlion.behavioral.observer.SimpledressStore.subjects.Subject;

public class User implements Observer {

    public String name;

    public User(String name) {
        this.name = name;
    }

    public void subscribe(Subject subject) {
        subject.addObserver(this);
    }

    public void unsubscribe(Subject subject) {
        subject.removeObserver(this);
    }

    public void sayHi() {
        System.out.println("Hi");
    }

    @Override
    public void update() {
        System.out.println(this.name + " is notified about the Red Dress");
    }
}
