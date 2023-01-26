package com.kodilla.good.paterns.challenges.product;

import com.kodilla.good.paterns.challenges.order.Order;
import com.kodilla.good.paterns.challenges.order.OrderRepository;
import com.kodilla.good.paterns.challenges.order.OrderRequest;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class ProductRepository implements OrderRepository {
    private Map<String, Order> orders = new HashMap<>();
    private LocalDate orderDate = LocalDate.now();

    public ProductRepository(Map<String, Order> orders, LocalDate orderDate) {
        this.orders = orders;
        this.orderDate = orderDate;
    }
    @Override
    public void createOrder(Order order, LocalDate localDate) {
        String localDateNow = localDate.toString();
        orders.put(localDateNow, order);

    }
    @Override
    public void showOrder(){
        for(Map.Entry<String, Order> entry : orders.entrySet()){
            System.out.println("Order day" + entry.getKey() + entry.getValue().getProduct().getProductName()
            +entry.getValue().getUser().getName());
        }
    }
    public boolean orderProduct(OrderRequest orderRequest){
        double finalPrice = orderRequest.getProduct().getProductPrice() * orderRequest.getQuantity();
        return true;
    }
}
