package com.kodilla.spring.portfolio;

public class Board {
    private TaskList toDoList;
    private TaskList inProgress;
    private TaskList doneList;

    public Board(TaskList toDoList, TaskList inProgress, TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgress = inProgress;
        this.doneList = doneList;
    }

    public TaskList getToDoList() {
        return toDoList;
    }

    public TaskList getInProgress() {
        return inProgress;
    }

    public TaskList getDoneList() {
        return doneList;
    }
}
