package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task {
    private final String taskName;
    private final String color;
    private final String whatToPaint;
    public boolean taskExecuted;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }
    @Override
    public String getTaskName() {
        return taskName;
    }
    @Override
    public String executeTask() {
        System.out.println("Executing task...");
        taskExecuted = true;
        return "Painting " + whatToPaint + " in color " + color;

    }
    @Override
    public boolean isTaskExecuted() {
        return taskExecuted;
    }
}
