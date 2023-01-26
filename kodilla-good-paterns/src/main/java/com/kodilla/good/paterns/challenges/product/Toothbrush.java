package com.kodilla.good.paterns.challenges.product;

public class Toothbrush {
    private String productName;
    private int productPrice;

    public Toothbrush(String productName, int productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public int getProductPrice() {
        return productPrice;
    }
}
