package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ParameterizedLoggingExample {
    private static final Logger logger = LoggerFactory.getLogger(ParameterizedLoggingExample.class);

    public static void main(String[] args) {
        String username = "john_doe";
        int id = 42;
        logger.info("User {} with ID {} has logged in", username, id);
    }
}
