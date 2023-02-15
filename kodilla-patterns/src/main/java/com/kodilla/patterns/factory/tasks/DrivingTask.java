package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task {
    private final String taskName;
    private final String where;
    private final String using;
    public boolean taskExecuted;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }
    @Override
    public String getTaskName() {
        return taskName;
    }
    @Override
    public String executeTask() {
        System.out.println("Executing task...");
        taskExecuted = true;
        return "Go to " + where + " by " + using;
    }
    @Override
    public boolean isTaskExecuted() {
        return taskExecuted;
    }
}
