package com.kodilla.good.paterns.challenges.order;

import com.kodilla.good.paterns.challenges.product.Product;
import com.kodilla.good.paterns.challenges.user.User;

public class OrderDto implements Order {
    public User user;
    public Product product;
    public boolean isOrdered;

    public OrderDto(User user, Product product, boolean isOrdered) {
        this.user = user;
        this.product = product;
        this.isOrdered = isOrdered;
    }

    @Override
    public User getUser() {
        return user;
    }

    @Override
    public Product getProduct() {
        return product;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
