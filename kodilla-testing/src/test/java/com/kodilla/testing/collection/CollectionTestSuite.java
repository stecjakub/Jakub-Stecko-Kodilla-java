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
        System.out.println("My First Test:");
        List<Integer> oddNumbers = Arrays.asList();
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> result = oddNumbersExterminator.exterminate(oddNumbers);
        System.out.println(result.size());
        Assertions.assertEquals(0, result.size());
    }

    @DisplayName("This Test checks whether list is normal")
    @Test
    public void testOddNumbersExterminatorNormalList() {
        List<Integer> oddNumbers = Arrays.asList(31,315,26,85,31,64,26,90,111,2);
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> result = oddNumbersExterminator.exterminate(oddNumbers);
        System.out.println(result.size());
        Assertions.assertEquals(5, result.size());
    }
}
