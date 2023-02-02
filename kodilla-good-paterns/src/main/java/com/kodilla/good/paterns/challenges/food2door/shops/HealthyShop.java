package com.kodilla.good.paterns.challenges.food2door.shops;

import com.kodilla.good.paterns.challenges.food2door.products.Product;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class HealthyShop implements Shop{
    private final Map<String, Product> ordersHealthyShop = new HashMap<>();

    @Override
    public boolean process(Product product, int quantity) {
        String timeOfOrder = LocalDate.now().toString();
        ordersHealthyShop.put(timeOfOrder,product);
        return false;
    }
}
