package com.kodilla.good.paterns.challenges.order;

import com.kodilla.good.paterns.challenges.product.Product;
import com.kodilla.good.paterns.challenges.user.User;

import java.time.LocalDate;

public class OrderRequest implements Order {
    private User user;
    private Product product;
    private int quantity;
    public OrderRequest(User user, Product product, int quantity) {
        this.user = user;
        this.product = product;
        this.quantity = quantity;
    }

    @Override
    public User getUser() {
        return user;
    }

    @Override
    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }
}
