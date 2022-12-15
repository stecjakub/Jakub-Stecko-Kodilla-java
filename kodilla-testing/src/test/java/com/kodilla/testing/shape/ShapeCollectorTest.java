package com.kodilla.testing.shape;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class ShapeCollectorTest {
    @DisplayName("Adding elements Test")
    @Test
    public void addingElementsTest() {
        ShapeCollector collectorAdd = new ShapeCollector();
        Shape s = new Square();
        Shape t = new Triangle();
        Circle c = new Circle();

        collectorAdd.addFigure(s);
        collectorAdd.addFigure(t);
        collectorAdd.addFigure(c);

        Assertions.assertEquals(3, collectorAdd);
    }

    @DisplayName("Removing elements Test")
    @Test
    public void removingElementsTest() {
        ShapeCollector collectorRemove = new ShapeCollector();
        Shape s = new Square();
        Shape t = new Triangle();
        Circle c = new Circle();

        collectorRemove.addFigure(s);
        collectorRemove.addFigure(t);
        collectorRemove.addFigure(c);

        boolean result = collectorRemove.removeFigure(s);


        Assertions.assertEquals(0, result);


    }
    @DisplayName("Getting some elements Test")
    @Test
    public void getElementTest(){
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle c = new Circle();
        Square s = new Square();
        Triangle t = new Triangle();

        Shape shape = shapeCollector.getFigure(0);

        Assertions.assertNull(shape);
    }
}
