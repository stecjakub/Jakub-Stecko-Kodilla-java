package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String SHOPING = "Shoping";
    public static final String PAINTING = "Painting";
    public static final String DRIVING = "Driving";

    public final Task makeTask(final String taskClass){
        return switch(taskClass){
            case SHOPING -> new ShoppingTask("Grocery shopping", "Bread",2);
            case PAINTING -> new PaintingTask("Wall painting", "white","wall");
            case DRIVING -> new DrivingTask("Driving for the lessons", " school", "Bus");
            default -> null;
        };
    }
}
