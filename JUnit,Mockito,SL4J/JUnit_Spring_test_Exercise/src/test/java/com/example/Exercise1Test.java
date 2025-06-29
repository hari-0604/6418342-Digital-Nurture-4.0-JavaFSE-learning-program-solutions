package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Exercise1Test {
    @Test
    void testAdd() {
        CalculatorService service = new CalculatorService();
        assertEquals(5, service.add(2, 3));
    }
}
