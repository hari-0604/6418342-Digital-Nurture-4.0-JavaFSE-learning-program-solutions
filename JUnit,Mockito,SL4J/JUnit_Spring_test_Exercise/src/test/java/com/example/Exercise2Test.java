package com.example;

import static org.mockito.Mockito.*;
import java.util.Optional;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest
public class Exercise2Test {

    @MockBean
    private UserRepository userRepository;

    @Test
    void testGetUserById() {
        User user = new User(1L, "Alice");
        when(userRepository.findById(1L)).thenReturn(Optional.of(user));

        UserService userService = new UserService();
        userService.userRepository = userRepository;

        assert userService.getUserById(1L).getName().equals("Alice");
    }
}
