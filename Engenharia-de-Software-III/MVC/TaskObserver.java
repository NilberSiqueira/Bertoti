package org.example;

import java.util.List;

public interface TaskObserver {
    void update(List<Task> tasks);
}
