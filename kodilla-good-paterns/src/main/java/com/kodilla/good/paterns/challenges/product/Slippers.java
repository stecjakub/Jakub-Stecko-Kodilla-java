package com.kodilla.good.paterns.challenges.product;

public class Slippers implements Product{
    private String productName;
    private double productPrice;

    public Slippers(String productName, double productPrice) {
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
