package com.kodilla.testing.shape;

public class Triangle implements Shape {
    private int height = 4;
    private int lenght = 5;
    public String getShapeName() {
        return "Triangle";
    }

    public int getField() {
        return (height * lenght) / 2;
    }
}
