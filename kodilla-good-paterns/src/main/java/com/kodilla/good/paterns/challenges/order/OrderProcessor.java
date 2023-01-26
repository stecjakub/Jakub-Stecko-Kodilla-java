package com.kodilla.good.paterns.challenges.order;

import com.kodilla.good.paterns.challenges.product.ProductRepository;

import java.time.LocalDate;

public class OrderProcessor {
    private OrderRepository orderRepository;
    private ProductRepository productRepository;

    public OrderProcessor(OrderRepository orderRepository, ProductRepository productRepository) {
        this.orderRepository = orderRepository;
        this.productRepository = productRepository;
    }

    public OrderDto process(OrderRequest orderRequest){
        boolean isOrdered = productRepository.orderProduct(orderRequest);
        if(isOrdered){
            orderRepository.createOrder(orderRequest, LocalDate.now());
            return new OrderDto(orderRequest.getUser(), orderRequest.getProduct(), true);
        }else {
            return new OrderDto(orderRequest.getUser(), orderRequest.getProduct(), false);
        }
    }


}
