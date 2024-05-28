package org.example;

import java.util.List;

public class TotalTasksStrategy implements StatisticsStrategy {
    public double calculate(List<Task> tasks) {
        return tasks.size();
    }
}
