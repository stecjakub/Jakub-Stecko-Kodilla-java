package com.kodilla.stream.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

public class ArrayOperationsTestSuite {
    @Test
    void testGetAverage(){
        int[] numbers = IntStream.range(4,16).toArray();
        double average = ArrayOperations.getAverage(numbers);
        //System.out.println(average);
        Assertions.assertEquals(9.5,average);
    }
}
