package com.kodilla.good.paterns.challenges.food2door.shops;

import com.kodilla.good.paterns.challenges.food2door.products.Product;

public interface Shop {
    boolean process(final Product product, int quantity);
}
