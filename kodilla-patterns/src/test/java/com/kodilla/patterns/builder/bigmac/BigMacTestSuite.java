package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigMacTestSuite {
    @Test
    void newBigMacTestSuite(){
        //Given
        BigMac bigMac = new BigMac.BigMacBuilder()
                .bun("Sezame bun")
                .burgers(2)
                .ingredient("Tomato")
                .ingredient("Onion")
                .ingredient("Cheese")
                .sauce("Ketchup")
                .bigMacBuild();
        //When
        int ingredientsSize = bigMac.getIngredients().size();
        //Then
        assertEquals(3, ingredientsSize);
        assertEquals("Ketchup", bigMac.getSauce());
        assertEquals("Sezame bun", bigMac.getBun());
        assertEquals(2, bigMac.getBurgers());
    }
}
