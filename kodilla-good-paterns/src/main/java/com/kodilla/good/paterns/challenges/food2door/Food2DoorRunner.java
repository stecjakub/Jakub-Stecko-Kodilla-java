package com.kodilla.good.paterns.challenges.food2door;

import com.kodilla.good.paterns.challenges.food2door.order.OrderProcessorDto;
import com.kodilla.good.paterns.challenges.food2door.order.OrderRequest;

public class Food2DoorRunner {
    public static void main(String[] args){

        OrderRequest orderRequest1 = new OrderRequest(2,241312, true);
        OrderRequest orderRequest2 = new OrderRequest(1,218312, false);
        OrderRequest orderRequest3 = new OrderRequest(6,719213, true);
        OrderRequest orderRequest4 = new OrderRequest(2,710912, false);
        OrderRequest orderRequest5 = new OrderRequest(3,719213, false);
        OrderRequest orderRequest6 = new OrderRequest(5,218312, true);

        OrderProcessorDto orderProcessorDto1 = new OrderProcessorDto(orderRequest1,true);
        OrderProcessorDto orderProcessorDto2 = new OrderProcessorDto(orderRequest2,false);
        OrderProcessorDto orderProcessorDto3 = new OrderProcessorDto(orderRequest3,true);
        OrderProcessorDto orderProcessorDto4 = new OrderProcessorDto(orderRequest4,false);
        OrderProcessorDto orderProcessorDto5 = new OrderProcessorDto(orderRequest5,false);
        OrderProcessorDto orderProcessorDto6 = new OrderProcessorDto(orderRequest6,true);

        orderProcessorDto1.showOrder();
        orderProcessorDto2.showOrder();
        orderProcessorDto3.showOrder();
        orderProcessorDto4.showOrder();
        orderProcessorDto5.showOrder();
        orderProcessorDto6.showOrder();

    }
}
