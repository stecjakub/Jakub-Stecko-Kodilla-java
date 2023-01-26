package com.kodilla.good.paterns.challenges.product;

public class Slippers {
    private String productName;
    private double productPrice;

    public Slippers(String productName, double productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }
}
