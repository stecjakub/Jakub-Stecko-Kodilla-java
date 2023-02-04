package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorTestSuite {
    @Autowired
    Calculator calculator;
    @Test
    void calculationTest(){
        //Given
        //When
        double add = calculator.add(2,5);
        double sub = calculator.sub(4,3);
        double mul = calculator.mul(8,2);
        double div = calculator.div(10,5);
        //Then
        assertEquals(add,7);
        assertEquals(sub,1);
        assertEquals(mul,16);
        assertEquals(div,2);
    }
}
