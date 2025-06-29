package com.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

public class Exercise9Test {

    @ParameterizedTest
    @CsvSource({"1,2,3", "4,5,9", "10,15,25"})
    void testAddition(int a, int b, int expected) {
        CalculatorService service = new CalculatorService();
        assertEquals(expected, service.add(a, b));
    }
}
