package com.kodilla.good.paterns.challenges.product;

import com.kodilla.good.paterns.challenges.order.Order;
import com.kodilla.good.paterns.challenges.order.OrderRepository;
import com.kodilla.good.paterns.challenges.order.OrderRequest;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class ProductRepository implements OrderRepository {
    private final Map<String, Order> orders = new HashMap<>();
    public LocalDate orderDate = LocalDate.now();

    @Override
    public void createOrder(Order order, LocalDate localDate) {
        orderDate = localDate;
        String localDateNow = localDate.toString();
        orders.put(localDateNow, order);

    }
    public void showOrder(){
        for(Map.Entry<String, Order> entry : orders.entrySet()){
            System.out.println("Order day: " + entry.getKey() + " Product: " +
                    entry.getValue().getProduct().getProductName() +
                    " User: " +entry.getValue().getUser().getName());
        }
    }
}
