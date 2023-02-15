package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task {
    private final String taskName;
    private final String whatToBuy;
    private final double quantity;
    public boolean taskExecuted;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }
    @Override
    public String getTaskName() {
        return taskName;
    }
    @Override
    public String executeTask() {
        System.out.println("Executing task...");
        taskExecuted = true;
        return "Buying " + quantity + " " + whatToBuy;
    }
    @Override
    public boolean isTaskExecuted() {
        return taskExecuted;
    }
}
