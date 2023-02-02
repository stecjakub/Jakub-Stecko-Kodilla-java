package com.kodilla.good.paterns.challenges.food2door.products;

import com.kodilla.good.paterns.challenges.food2door.shops.ExtraFoodShop;
import com.kodilla.good.paterns.challenges.food2door.shops.GlutenFreeShop;
import com.kodilla.good.paterns.challenges.food2door.shops.HealthyShop;
import com.kodilla.good.paterns.challenges.food2door.shops.Shop;
import com.kodilla.good.paterns.challenges.product.ProductRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductsRepository {
    private List<Products> productsList = new ArrayList<>();
    private final Map<Double, Shop> shopMap = new HashMap<>();
    public ProductsRepository(){
        Shop extraFoodShop = new ExtraFoodShop();
        Shop glutenFreeShop = new GlutenFreeShop();
        Shop healthyShop = new HealthyShop();

        productsList.add(new Products("Pizza",25.11,241312));
        productsList.add(new Products("Pasta",12.21,218312));
        productsList.add(new Products("Orange",4.43,719213));
        productsList.add(new Products("Juice",9.35,710912));
        productsList.add(new Products("Meat",41.99,651231));
        productsList.add(new Products("Water",2.47,231341));

        shopMap.put(productsList.get(0).barcode().doubleValue(), extraFoodShop);
        shopMap.put(productsList.get(1).barcode().doubleValue(), extraFoodShop);
        shopMap.put(productsList.get(2).barcode().doubleValue(), glutenFreeShop);
        shopMap.put(productsList.get(3).barcode().doubleValue(), glutenFreeShop);
        shopMap.put(productsList.get(4).barcode().doubleValue(), healthyShop);
        shopMap.put(productsList.get(5).barcode().doubleValue(), healthyShop);
    }
}
