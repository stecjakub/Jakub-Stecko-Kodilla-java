package com.kodilla.testing.shape;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;
@Nested
class ShapeCollectorTest {
    @DisplayName("Adding elements Test")
    @Test
    public void myTest(){
        ShapeCollector collectorAdd = new ShapeCollector();
        Shape s = new Square();
        Shape t = new Triangle();
        Circle c = new Circle();

        collectorAdd.addFigure(s);
        collectorAdd.addFigure(t);
        collectorAdd.addFigure(c);
    }
    @DisplayName("Removing elements Test")
    @Test
    public void myTest2(){
        ShapeCollector collectorRemove = new ShapeCollector();
        Shape s = new Square();
        Shape t = new Triangle();
        Circle c = new Circle();

        collectorRemove.removeFigure(s);
        collectorRemove.removeFigure(t);
        collectorRemove.removeFigure(c);

    }
    @DisplayName("Getting elements Test")
    @Test
    public void myTest3(){
        ShapeCollector collectorGet = new ShapeCollector();
        Triangle triangle = new Triangle();
        collectorGet.addFigure(triangle);

    }
    @DisplayName("Showing elements Test")
    @Test
    public void myTest4(){
        ShapeCollector collectorShow = new ShapeCollector();
        collectorShow.showFigures();

    }
}