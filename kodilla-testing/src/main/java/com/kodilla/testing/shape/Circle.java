package com.kodilla.testing.shape;

public class Circle implements Shape {
    private int pi = 3;
    private int radius = 5;

    public String getShapeName(){
        return "Circle";

    }
    public int getField() {
        return (pi * radius) ^ 2;
    }
}
