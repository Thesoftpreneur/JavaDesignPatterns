package com.amberlion.behavioral.observer.simpleDressStore;

import com.amberlion.behavioral.observer.simpleDressStore.observers.User;
import com.amberlion.behavioral.observer.simpleDressStore.subjects.RedDress;

public class DressStoreSimulator {
    public static void main(String[] args) {
        User anna = new User("Anna");
        User jane = new User("Jane");
        User tom = new User("Tom");
        RedDress redDress = new RedDress();
        anna.sayHi();
        anna.subscribe(redDress);
        jane.subscribe(redDress);
        tom.subscribe(redDress);
        redDress.notifyObservers();
        System.out.println("Tom don't like the dress and unsubscribes");
        tom.unsubscribe(redDress);
        redDress.notifyObservers();
    }

}
