package com.example.exercise4;

import com.example.ExternalApi;
import com.example.MyService;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class MyServiceTest {
    @Test
    public void testVoidMethod() {
        ExternalApi mockApi = mock(ExternalApi.class);
        MyService service = new MyService(mockApi);

        doNothing().when(mockApi).sendData(anyString());

        service.processAndSend("input");

        verify(mockApi).sendData("INPUT");
    }
}
