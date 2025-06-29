package com.example.exercise6;

import com.example.ExternalApi;
import com.example.MyService;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import org.mockito.InOrder;

public class MyServiceTest {
    @Test
    public void testInteractionOrder() {
        ExternalApi mockApi = mock(ExternalApi.class);

        mockApi.getData();
        mockApi.sendData("Data");

        InOrder inOrder = inOrder(mockApi);
        inOrder.verify(mockApi).getData();
        inOrder.verify(mockApi).sendData("Data");
    }
}
