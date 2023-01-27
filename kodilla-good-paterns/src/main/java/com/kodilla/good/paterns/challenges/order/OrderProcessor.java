package com.kodilla.good.paterns.challenges.order;

import com.kodilla.good.paterns.challenges.product.ProductRepository;
import com.kodilla.good.paterns.challenges.product.ProductService;

import java.time.LocalDate;

public class OrderProcessor {
    private OrderRepository orderRepository;
    private ProductService productService;

    public OrderProcessor(ProductService productService,OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
        this.productService = productService;
    }

    public OrderDto process(OrderRequest orderRequest){
        boolean isOrdered = productService.orderProduct(orderRequest);
        if(isOrdered){
            orderRepository.createOrder(orderRequest, LocalDate.now());
            return new OrderDto(orderRequest.getUser(), orderRequest.getProduct(), true);
        }else {
            return new OrderDto(orderRequest.getUser(), orderRequest.getProduct(), false);
        }
    }
}
