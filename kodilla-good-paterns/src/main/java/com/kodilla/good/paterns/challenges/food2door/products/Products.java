package com.kodilla.good.paterns.challenges.food2door.products;

public class Products implements Product{
    private final String productName;
    private final double productPrice;

    public Products(String productName, double productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }

    @Override
    public String productName() {
        return productName;
    }

    @Override
    public double productPrice() {
        return productPrice;
    }
}
