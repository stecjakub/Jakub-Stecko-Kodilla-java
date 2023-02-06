package com.kodilla.spring.portfolio;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TaskList {
    private final List<String> tasks;

    public TaskList(List<String> tasks) {
        this.tasks = tasks;
    }
   public TaskList() {
        tasks = new ArrayList<>();
   }
    public void addTask(String task) {
        tasks.add(task);
    }
   public List<String> getTasks() {
        return new ArrayList<>(tasks);
   }
}
