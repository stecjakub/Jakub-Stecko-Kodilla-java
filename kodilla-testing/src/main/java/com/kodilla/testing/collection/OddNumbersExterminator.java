package com.kodilla.testing.collection;

import java.util.*;
import java.lang.*;

public class OddNumbersExterminator {

    public List<Integer> exterminate(List<Integer> numbers) {
        List<Integer> evenNumbers = new LinkedList<>();
        for(int number : numbers) {
            if(number % 2 ==0) {
                evenNumbers.add(number);
            }
        }
        return evenNumbers;
    }
}
