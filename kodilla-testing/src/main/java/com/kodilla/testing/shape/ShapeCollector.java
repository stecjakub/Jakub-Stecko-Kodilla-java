package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;


public class ShapeCollector {
    private List<Shape> shapes= new ArrayList<>();


    public void addFigure(Shape shape){
        shapes.add(shape);

    }
    public boolean removeFigure(Shape shape){
        return true;

    }
    public Shape getFigure(int n){
        if(n > shapes.size()-1){
            return null;
        }
        return shapes.get(n);

    }
    public void showFigures(){
        for( Shape s : shapes){
            System.out.println(s);
        }
    }
}
