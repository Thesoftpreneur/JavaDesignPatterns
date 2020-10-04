package com.amberlion.behavioral.observer.SimpledressStore.observers;

import com.amberlion.behavioral.observer.SimpledressStore.subjects.Subject;

public interface Observer {
    void update();

    void subscribe(Subject s);
    void unsubscribe(Subject s);
}
