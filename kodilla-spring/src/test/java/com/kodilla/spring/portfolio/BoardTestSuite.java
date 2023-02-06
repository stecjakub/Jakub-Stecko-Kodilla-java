package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;


public class BoardTestSuite {
    @Test
    void testTaskAdd(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        board.getToDoList().addTask("Work to do");
        board.getInProgress().addTask("Work in progress");
        board.getDoneList().addTask("Work done");

        List<String> toDoTask = board.getToDoList().getTasks();
        List<String> inProgressTask = board.getInProgress().getTasks();
        List<String> doneTasks = board.getDoneList().getTasks();

        //Then
        System.out.println(toDoTask);
        System.out.println(inProgressTask);
        System.out.println(doneTasks);
    }
}
