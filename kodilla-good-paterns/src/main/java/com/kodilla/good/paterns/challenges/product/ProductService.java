package com.kodilla.good.paterns.challenges.product;

import com.kodilla.good.paterns.challenges.order.OrderRequest;

public class ProductService {
    public boolean orderProduct(OrderRequest orderRequest){
        double finalPrice = orderRequest.getProduct().getProductPrice() * orderRequest.getQuantity();
        return true;
    }
}
