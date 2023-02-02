package com.kodilla.good.paterns.challenges.food2door.order;

public class OrderProcessorDto {
    private OrderRequest orderRequest;
    private boolean isOrdered;

    public OrderProcessorDto(OrderRequest orderRequest, boolean isOrdered) {
        this.orderRequest = orderRequest;
        this.isOrdered = isOrdered;
    }
    public void showOrder(){
        System.out.println("Quantity: "+ orderRequest.getQuantity() + " has been ordered? " + orderRequest.isOrdered());
    }
}
