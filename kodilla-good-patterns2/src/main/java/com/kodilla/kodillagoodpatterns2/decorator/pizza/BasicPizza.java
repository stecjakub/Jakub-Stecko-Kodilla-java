package com.kodilla.kodillagoodpatterns2.decorator.pizza;

import java.math.BigDecimal;

public class BasicPizza implements PizzaOrder {
    @Override
    public BigDecimal getCost() {
        return new BigDecimal(15);
    }

    @Override
    public String getDescription() {
        return "Ciasto i sos pomidorowy z serem";
    }
}
