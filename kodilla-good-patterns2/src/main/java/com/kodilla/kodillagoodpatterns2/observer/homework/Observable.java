package com.kodilla.kodillagoodpatterns2.observer.homework;

public interface Observable {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notify();
}
