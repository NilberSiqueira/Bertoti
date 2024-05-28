package org.example;

public class SimpleTask implements Task{
    private double timeSpent;

    public SimpleTask(double timeSpent) {
        this.timeSpent = timeSpent;
    }

    @Override
    public void addTask(Task task) {
        // Não implementado para tarefas simples
    }

    @Override
    public void removeTask(Task task) {
        // Não implementado para tarefas simples
    }

    @Override
    public double getTimeSpent() {
        return timeSpent;
    }
}
