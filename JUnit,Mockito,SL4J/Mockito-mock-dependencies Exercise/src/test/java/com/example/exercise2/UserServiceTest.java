package com.example;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Optional;
import org.junit.jupiter.api.Test;

public class UserServiceTest {

    @Test
    void testGetUserById() {
        UserRepository mockRepo = mock(UserRepository.class);
        when(mockRepo.findById(1L)).thenReturn(Optional.of(new User(1L, "Mocked Repo")));

        UserService service = new UserService();
        service.userRepository = mockRepo;

        User user = service.getUserById(1L);
        assertEquals("Mocked Repo", user.getName());
    }
}
