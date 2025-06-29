package com.example;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(UserController.class)
public class Exercise8Test {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private UserService userService;

    @Test
    void testExceptionHandler() throws Exception {
        when(userService.getUserById(99L)).thenThrow(new java.util.NoSuchElementException());

        mockMvc.perform(get("/users/99"))
                .andExpect(status().isNotFound())
                .andExpect(content().string("User not found"));
    }
}
