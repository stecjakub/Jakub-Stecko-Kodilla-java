package com.kodilla.good.paterns.challenges.product;

public class Games implements Product {
    private String productName;
    private double productPrice;

    public Games(String productName, double productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }

    @Override
    public String getProductName() {
        return productName;
    }

    @Override
    public double getProductPrice() {
        return productPrice;
    }
}
