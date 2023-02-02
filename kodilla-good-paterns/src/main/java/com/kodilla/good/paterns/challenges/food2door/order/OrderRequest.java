package com.kodilla.good.paterns.challenges.food2door.order;

public class OrderRequest {
    private int quantity;
    private final Integer barcode;
    private boolean isOrdered;

    public OrderRequest(int quantity, Integer barcode, boolean isOrdered) {
        this.quantity = quantity;
        this.barcode = barcode;
        this.isOrdered = isOrdered;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean isOrdered() {
        return isOrdered;
    }

    public Integer getBarcode() {
        return barcode;
    }
}
