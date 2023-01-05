package com.kodilla.testing.shape;

public class Square implements Shape {
    private int height = 3;
    private int lenght = 7;
    @Override
    public String getShapeName() {
        return "Circle";

    }
    @Override
    public int getField() {
        return height * lenght;
    }
}
