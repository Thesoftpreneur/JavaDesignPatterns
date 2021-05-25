package com.amberlion.behavioral.observer.simpleDressStore.observers;

import com.amberlion.behavioral.observer.simpleDressStore.subjects.Subject;

public interface Observer {
    void update();

    void subscribe(Subject s);
    void unsubscribe(Subject s);
}
