package com.kodilla.kodillagoodpatterns2.observer.homework;

public class Mentor implements Observer {
    private final String mentorName;

    public Mentor(String mentorName) {
        this.mentorName = mentorName;
    }

    @Override
    public void update(Observable observable, Object o) {
        TaskQueue taskQueue = (TaskQueue) observable;
        System.out.println("Hey " + mentorName + ", you have new task to check for " + taskQueue.getStudentName() +
                "\n (total: " + taskQueue.getTasks().size() + " tasks)");
    }
}
