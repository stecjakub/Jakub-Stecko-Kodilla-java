package collection;

import java.util.LinkedList;
import java.util.*;
import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Assertions;


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
        List<Integer> oddNumbers = new LinkedList<>();

        boolean condition = oddNumbers.isEmpty();
        if (condition == true) {
            System.out.println("The List is empty");
        } else {
            System.out.println("The List is not empty");
        }
        if (oddNumbers.toArray().length % 2 == 0) {
            System.out.println(oddNumbers);
        }
    }
    @DisplayName("This test checks if there are even numbers")

    @Test
    public void testOddNumbersExterminatorNormalList(){
        List<Integer> oddNumbers = new LinkedList<>();
        oddNumbers.add(1);
        oddNumbers.add(2);
        oddNumbers.add(3);
        oddNumbers.add(5);
        oddNumbers.add(7);
        oddNumbers.add(9);

        if (oddNumbers.toArray().length % 2 == 0) {
            System.out.println(oddNumbers);
        }
    }
}
