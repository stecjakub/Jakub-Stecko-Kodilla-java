package com.kodilla.good.paterns.challenges.product;

public class Toothbrush implements Product{
    private String productName;
    private double productPrice;

    public Toothbrush(String productName, double productPrice) {
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
