package com.example;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Exercise4Test {

    @Autowired
    private UserService userService;

    @Test
    void testSaveAndRetrieveUser() {
        User saved = userService.saveUser(new User(10L, "Test"));
        User found = userService.getUserById(10L);

        assertThat(found.getName()).isEqualTo("Test");
    }
}
