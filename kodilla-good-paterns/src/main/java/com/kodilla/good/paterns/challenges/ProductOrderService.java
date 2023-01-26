package com.kodilla.good.paterns.challenges;

import com.kodilla.good.paterns.challenges.order.OrderDto;
import com.kodilla.good.paterns.challenges.order.OrderProcessor;
import com.kodilla.good.paterns.challenges.order.OrderRequest;
import com.kodilla.good.paterns.challenges.product.Games;
import com.kodilla.good.paterns.challenges.product.ProductRepository;
import com.kodilla.good.paterns.challenges.product.Slippers;
import com.kodilla.good.paterns.challenges.product.Toothbrush;
import com.kodilla.good.paterns.challenges.user.User;

public class ProductOrderService {
    public static void main(String[] args){

        OrderRequest order1 = new OrderRequest(new User("Michael","Clinton"), new Games("God of War",316),1);
        //OrderRequest order2 = new OrderRequest(new User("Trevor", "Smith"), new Slippers("Home Slippers",71.99),2);
        //OrderRequest order3 = new OrderRequest(new User("Franklin", "Jones"), new Toothbrush("Colgate",15.99),2);

        ProductRepository productRepository = new ProductRepository();
        OrderProcessor processor = new OrderProcessor(new ProductRepository(), productRepository);

        OrderDto dto1 = processor.process(order1);
        //OrderDto dto2 = processor.process(order2);
        //OrderDto dto3 = processor.process(order3);

        productRepository.showOrder();
    }
}
