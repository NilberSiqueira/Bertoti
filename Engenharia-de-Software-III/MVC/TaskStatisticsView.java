package org.example;

import java.util.List;

public class TaskStatisticsView implements TaskObserver {
    private StatisticsStrategy strategy;

    public TaskStatisticsView(StatisticsStrategy strategy) {
        this.strategy = strategy;
    }

    @Override
    public void update(List<Task> tasks) {
        double result = strategy.calculate(tasks);
        System.out.println("Statistics: " + result);
    }
}
