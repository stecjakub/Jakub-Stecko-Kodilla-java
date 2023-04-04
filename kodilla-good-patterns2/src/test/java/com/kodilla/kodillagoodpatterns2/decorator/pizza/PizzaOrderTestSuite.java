package com.kodilla.kodillagoodpatterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaOrderTestSuite {
    @Test
    public void testBasicPizzaOrder() {
        // Given
        PizzaOrder pizzaOrder = new BasicPizza();

        // When
        String description = pizzaOrder.getDescription();
        BigDecimal cost = pizzaOrder.getCost();

        // Then
        assertEquals("Ciasto i sos pomidorowy z serem", description);
        assertEquals(new BigDecimal(15), cost);
    }

    @Test
    public void testExtraCheeseDecorator() {
        // Given
        PizzaOrder pizzaOrder = new ExtraCheeseDecorator(new BasicPizza());

        // When
        String description = pizzaOrder.getDescription();
        BigDecimal cost = pizzaOrder.getCost();

        // Then
        assertEquals("Ciasto i sos pomidorowy z serem z dodatkowym serem", description);
        assertEquals(new BigDecimal(18), cost);
    }

    @Test
    public void testExtraIngredientsDecorator() {
        // Given
        PizzaOrder pizzaOrder = new ExtraIngredientsDecorator(new BasicPizza());

        // When
        String description = pizzaOrder.getDescription();
        BigDecimal cost = pizzaOrder.getCost();

        // Then
        assertEquals("Ciasto i sos pomidorowy z serem z dodatkowymi składnikami", description);
        assertEquals(new BigDecimal(20), cost);
    }

    @Test
    public void testExtraCheeseAndIngredientsDecorator() {
        // Given
        PizzaOrder pizzaOrder = new ExtraIngredientsDecorator(new ExtraCheeseDecorator(new BasicPizza()));

        // When
        String description = pizzaOrder.getDescription();
        BigDecimal cost = pizzaOrder.getCost();

        // Then
        assertEquals("Ciasto i sos pomidorowy z serem z dodatkowym serem z dodatkowymi składnikami", description);
        assertEquals(new BigDecimal(23), cost);
    }
}
