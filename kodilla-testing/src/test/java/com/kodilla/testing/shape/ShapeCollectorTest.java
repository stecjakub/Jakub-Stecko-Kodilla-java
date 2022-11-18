package com.kodilla.testing.shape;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;
@Nested
class ShapeCollectorTest {
    @DisplayName("Adding elements Test")
    @Test
    public void testAddingElements(){
        //Given
        ShapeCollector collectorAdd = new ShapeCollector();
        Shape s = new Square();
        Shape t = new Triangle();
        Circle c = new Circle();
        //When
        collectorAdd.addFigure(s);
        collectorAdd.addFigure(t);
        collectorAdd.addFigure(c);
        //Then
        Assertions.assertEquals(s, collectorAdd.getFigure(0));
        Assertions.assertEquals(t, collectorAdd.getFigure(1));
        Assertions.assertEquals(c, collectorAdd.getFigure(2));

        Assertions.assertTrue(collectorAdd.getFigureAmount() == 3);
    }
    @DisplayName("Removing elements Test")
    @Test
    public void testRemovingElements(){
        ShapeCollector collectorRemove = new ShapeCollector();
        Shape s = new Square();
        Shape t = new Triangle();
        Circle c = new Circle();

        collectorRemove.addFigure(s);
        collectorRemove.removeFigure(s);
        //collectorRemove.removeFigure(t);
        //collectorRemove.removeFigure(c);

        Assertions.assertEquals(collectorRemove.getFigureAmount(), 0);

    }
    @DisplayName("Getting elements Test")
    @Test
    public void myTest3(){
        ShapeCollector collectorGet = new ShapeCollector();
        Triangle triangle = new Triangle();
        collectorGet.addFigure(triangle);

        Assertions.assertTrue(triangle.getShapeName() == "Triangle");

    }
    @DisplayName("Showing elements Test")
    @Test
    public void myTest4(){
        ShapeCollector collectorShow = new ShapeCollector();
        collectorShow.showFigures();
        Assertions.assertEquals(collectorShow.getFigureAmount(), 0);
    }
}