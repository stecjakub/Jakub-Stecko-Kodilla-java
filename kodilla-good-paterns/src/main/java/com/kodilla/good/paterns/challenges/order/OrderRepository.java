package com.kodilla.good.paterns.challenges.order;

import java.time.LocalDate;

public interface OrderRepository {
    void createOrder(Order order, LocalDate localDate);
    void showOrder();
}
