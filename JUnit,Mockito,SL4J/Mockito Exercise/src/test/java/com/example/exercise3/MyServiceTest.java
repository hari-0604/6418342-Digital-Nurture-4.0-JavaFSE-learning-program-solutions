package com.example.exercise3;

import com.example.ExternalApi;
import com.example.MyService;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class MyServiceTest {
    @Test
    public void testArgumentMatching() {
        ExternalApi mockApi = mock(ExternalApi.class);
        MyService service = new MyService(mockApi);

        service.processAndSend("test");

        verify(mockApi).sendData(eq("TEST"));
    }
}
