package com.example;

import java.util.Optional;
import java.util.NoSuchElementException;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

public class Exercise6Test {

    @Test
    void testMissingUserThrowsException() {
        UserRepository repo = mock(UserRepository.class);
        when(repo.findById(99L)).thenReturn(Optional.empty());

        UserService service = new UserService();
        service.userRepository = repo;

        try {
            service.getUserById(99L);
            assert false; // should not reach here
        } catch (NoSuchElementException e) {
            assert true;
        }
    }
}
