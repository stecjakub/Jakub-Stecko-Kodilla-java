package com.kodilla.good.paterns.challenges.food2door.products;

import java.util.Objects;

public class Products implements Product{
    private final String productName;
    private final Double productPrice;
    private final Integer barcode;

    public Products(String productName, Double productPrice, Integer barcode) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.barcode = barcode;
    }

    @Override
    public String productName() {
        return productName;
    }

    @Override
    public Double productPrice() {
        return productPrice;
    }
    @Override
    public Integer barcode(){
        return barcode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Products products = (Products) o;
        return Objects.equals(productName, products.productName) && Objects.equals(productPrice, products.productPrice) && Objects.equals(barcode, products.barcode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName, productPrice, barcode);
    }
}
