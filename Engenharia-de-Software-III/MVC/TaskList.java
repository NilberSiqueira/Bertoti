package org.example;

import java.util.ArrayList;
import java.util.List;

public class TaskList implements TaskSubject {

    private List<Task> tasks = new ArrayList<>();
    private List<TaskObserver> observers = new ArrayList<>();

    public void addTask(Task task) {
        tasks.add(task);
        notifyObservers();
    }

    public void removeTask(Task task) {
        tasks.remove(task);
        notifyObservers();
    }

    @Override
    public void attach(TaskObserver observer) {
        observers.add(observer);
    }

    @Override
    public void detach(TaskObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (TaskObserver observer : observers) {
            observer.update(tasks);
        }
    }
}
