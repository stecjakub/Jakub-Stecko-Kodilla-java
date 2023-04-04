package com.kodilla.kodillagoodpatterns2.decorator.pizza;

import java.math.BigDecimal;

public class ExtraIngredientsDecorator extends AbstractPizzaOrderDecorator {
    public ExtraIngredientsDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(5));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " z dodatkowymi składnikami";
    }
}
