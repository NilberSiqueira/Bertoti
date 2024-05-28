package org.example;

public interface Task {
    void addTask(Task task);
    void removeTask(Task task);
    double getTimeSpent();
}
