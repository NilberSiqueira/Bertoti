package org.example;

import java.util.List;

public class AverageTimeStrategy implements StatisticsStrategy {

    @Override
    public double calculate(List<Task> tasks) {
        if (tasks.isEmpty()) return 0;
        double total = 0;
        for (Task task : tasks) {
            total += task.getTimeSpent();
        }
        return total / tasks.size();
    }
}
