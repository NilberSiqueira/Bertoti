package org.example;

public interface TaskSubject {
    void attach(TaskObserver observer);
    void detach(TaskObserver observer);
    void notifyObservers();
}
