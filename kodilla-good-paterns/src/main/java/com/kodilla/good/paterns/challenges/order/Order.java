package com.kodilla.good.paterns.challenges.order;

import com.kodilla.good.paterns.challenges.product.Product;
import com.kodilla.good.paterns.challenges.user.User;

public interface Order {
    User getUser();
    Product getProduct();
}
