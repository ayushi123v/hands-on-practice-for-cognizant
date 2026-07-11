package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    void testAddition() {

        Calculator cal = new Calculator();

        int result = cal.add(5, 3);

        assertEquals(8, result);
    }
}