package com.kodilla.kodillagoodpatterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class TaskQueue implements Observable {
    private final List<String> tasks;
    private final String studentName;

    public TaskQueue(String studentName) {
        tasks = new ArrayList<>();
        this.studentName = studentName;
    }

    public void addTask(String task) {
        tasks.add(task);
    }

    public List<String> getTasks() {
        return tasks;
    }

    public String getStudentName() {
        return studentName;
    }
    @Override
    public void notify(){
        for(String t : tasks){

        }
    }
}
