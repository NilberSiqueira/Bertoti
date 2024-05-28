package org.example;

public class TaskManager {
    public static void main(String[] args) {
        TaskList taskList = new TaskList();

        // Criando observers
        TaskObserver averageTimeView = new TaskStatisticsView(new AverageTimeStrategy());
        TaskObserver totalTasksView = new TaskStatisticsView(new TotalTasksStrategy());

        // Associando observers ao subject
        taskList.attach(averageTimeView);
        taskList.attach(totalTasksView);

        // Adicionando algumas tarefas
        Task simpleTask1 = new SimpleTask(2);
        Task simpleTask2 = new SimpleTask(3);
        taskList.addTask(simpleTask1);
        taskList.addTask(simpleTask2);

        // Removendo uma tarefa
        taskList.removeTask(simpleTask1);
    }
}
