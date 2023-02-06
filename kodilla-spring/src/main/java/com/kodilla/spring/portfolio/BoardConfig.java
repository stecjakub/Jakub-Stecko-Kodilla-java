package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoardConfig {
    @Bean("ToDoList")
    TaskList makeToDoList(){
        return new TaskList();
    }
    @Bean("InProgressList")
    TaskList makeInProgressList(){
        return new TaskList();
    }
    @Bean("DoneList")
    TaskList makeDoneList(){
        return new TaskList();
    }
    @Bean("InjectTaskToBoard")
    Board injectTaskToBoard(){
        return new Board(makeToDoList(), makeInProgressList(), makeDoneList());
    }
}
