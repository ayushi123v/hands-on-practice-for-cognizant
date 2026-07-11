package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AAAPatternTest3 {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
        System.out.println("Setup executed");
    }

    @Test
    void testAddition() {

        
        int a = 10;
        int b = 20;

     
        int result = calculator.add(a, b);

      
        assertEquals(30, result);
    }

   
    @AfterEach
    void tearDown() {
        calculator = null;
        System.out.println("Teardown executed");
    }
}