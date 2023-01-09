package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

public class ShapeCollectorTestSuite {
    @BeforeAll
    public static void beforeAllTest(){
        System.out.println("This is the beginning of the test");
    }
    @AfterAll
    public static void afterAllTest(){
        System.out.println("This is the end of the test");
    }
    @Nested
    @DisplayName("Test for shapes")
    class Tests{
        @DisplayName("Adding elements Test ")
        @Test
        public void addingElementsTest() {
            ShapeCollector collectorAdd = new ShapeCollector();
            Shape s = new Square();
            Shape t = new Triangle();
            Circle c = new Circle();

            collectorAdd.addFigure(s);
            collectorAdd.addFigure(t);
            collectorAdd.addFigure(c);

            Assertions.assertEquals(s, collectorAdd.getFigure(0));
            Assertions.assertEquals(t, collectorAdd.getFigure(1));
            Assertions.assertEquals(c, collectorAdd.getFigure(2));
        }

        @DisplayName("Removing elements Test")
        @Test
        public void removingElementsTest() {
            ShapeCollector collectorRemove = new ShapeCollector();
            Shape s = new Square();
            Shape t = new Triangle();
            Circle c = new Circle();

            collectorRemove.addFigure(s);

            boolean result = collectorRemove.removeFigure(s);

            Assertions.assertTrue(result);


        }
        @DisplayName("Getting some elements Test")
        @Test
        public void testGetElementThatDoesNotExist(){
            ShapeCollector shapeCollector = new ShapeCollector();
            Circle c = new Circle();
            Square s = new Square();
            Triangle t = new Triangle();

            Shape shape = shapeCollector.getFigure(0);

            Assertions.assertNull(shape);
        }
    }
}
