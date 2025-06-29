package com.example;

import java.util.List;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;

public class Exercise7Test {

    @Test
    void testCustomQuery() {
        UserRepository repo = mock(UserRepository.class);
        when(repo.findByName("Alice")).thenReturn(List.of(new User(1L, "Alice")));

        assert repo.findByName("Alice").get(0).getName().equals("Alice");
    }
}
