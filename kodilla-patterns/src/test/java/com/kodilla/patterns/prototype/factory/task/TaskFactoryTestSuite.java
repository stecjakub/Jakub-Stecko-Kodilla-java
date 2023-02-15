package com.kodilla.patterns.prototype.factory.task;

import com.kodilla.patterns.factory.tasks.PaintingTask;
import com.kodilla.patterns.factory.tasks.ShoppingTask;
import com.kodilla.patterns.factory.tasks.Task;
import com.kodilla.patterns.factory.tasks.TaskFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskFactoryTestSuite {
    @Test
    void testShoppingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task shopping = taskFactory.makeTask(TaskFactory.SHOPING);
        //Then
        assertEquals("Grocery shopping", shopping.getTaskName());
        assertEquals("Buying 2.0 Bread", shopping.executeTask());
        assertEquals(true,shopping.isTaskExecuted());
    }
    @Test
    void testDrivingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task driving = taskFactory.makeTask(TaskFactory.DRIVING);
        //Then
        assertEquals("Driving for the lessons", driving.getTaskName());
        assertEquals("Go to  school by Bus", driving.executeTask());
        assertEquals(true, driving.isTaskExecuted());
    }
    @Test
    void testPaintingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task painting  = taskFactory.makeTask(TaskFactory.PAINTING);
        //Then
        assertEquals("Wall painting",painting.getTaskName());
        assertEquals("Painting wall in color white", painting.executeTask());
        assertEquals(true,painting.isTaskExecuted());
    }
}
