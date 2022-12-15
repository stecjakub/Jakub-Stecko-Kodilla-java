package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.Arrays;
import java.util.List;

public class CollectionTestSuite {
    @BeforeEach
    public void before() {
        System.out.println("The case: begin");
    }
    @AfterEach
    public void after() {
        System.out.println("The case: end");
    }

    @DisplayName("This test checks whether list is empty or not ")

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        System.out.println("myFirstTest");
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> newOddNumbersList = Arrays.asList();
        List<Integer> oddNumbers = oddNumbersExterminator.exterminate(newOddNumbersList);
        System.out.println("Odd numbers size: " + oddNumbers.size());
        Assertions.assertEquals(0,oddNumbers.size());


    }
    @DisplayName("This test checks if there are even numbers")

    @Test
    public void testOddNumbersExterminatorNormalList(){
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> newOddNumbersList = Arrays.asList(15,18,65,42,314,1234,1,45,65,22);
        List<Integer> oddNumbers = oddNumbersExterminator.exterminate(newOddNumbersList);
        System.out.println("Odd numbers size: " + oddNumbers.size());
        Assertions.assertEquals(5,oddNumbers.size());
    }
}
