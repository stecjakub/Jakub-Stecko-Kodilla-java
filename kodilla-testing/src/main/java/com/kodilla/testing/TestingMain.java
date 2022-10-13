package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int result1 = calculator.add(6,5);
        int result2 = calculator.substract(6,5);

        if (result1 == 11) {
            System.out.println("test1 OK");
        } else {
            System.out.println("Error!");
        }
        if (result2 == 1){
            System.out.println("test2 OK");
        }else{
            System.out.println("Error");
        }
    }
}