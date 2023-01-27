package com.kodilla.good.paterns.challenges;

import com.kodilla.good.paterns.challenges.order.OrderDto;
import com.kodilla.good.paterns.challenges.order.OrderProcessor;
import com.kodilla.good.paterns.challenges.order.OrderRequest;
import com.kodilla.good.paterns.challenges.product.*;
import com.kodilla.good.paterns.challenges.user.User;

import java.util.Map;

public class ProductOrderService {
    public static void main(String[] args){
        System.out.println("Produkt Order Serivce:" + "\n");

        OrderRequest order1 = new OrderRequest(new User("Michael","Clinton"), new Games("God of War",316),1);
        OrderRequest order2 = new OrderRequest(new User("Trevor", "Smith"), new Slippers("Home Slippers",71.99),2);
        OrderRequest order3 = new OrderRequest(new User("Franklin", "Jones"), new Toothbrush("Colgate",15.99),2);

        ProductRepository productRepository = new ProductRepository();
        OrderProcessor processor = new OrderProcessor(new ProductService(), productRepository);

        OrderDto dto1 = processor.process(order1);
        System.out.println("User " + dto1.getUser().getName() +
                " " + dto1.getUser().getLastName() + " Ordered: " + dto1.getProduct().getProductName());
        OrderDto dto2 = processor.process(order2);
        System.out.println("User " + dto2.getUser().getName() +
                " " + dto2.getUser().getLastName() + " Ordered: " + dto2.getProduct().getProductName());
        OrderDto dto3 = processor.process(order3);
        System.out.println("User " + dto3.getUser().getName() +
                " " + dto3.getUser().getLastName() + " Ordered: " + dto3.getProduct().getProductName());

        productRepository.showOrder();
    }
}
