package com.example.exercise7;

import com.example.ExternalApi;
import com.example.MyService;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class MyServiceTest {
    @Test
    public void testVoidMethodException() {
        ExternalApi mockApi = mock(ExternalApi.class);
        MyService service = new MyService(mockApi);

        doThrow(new RuntimeException("Error"))
            .when(mockApi).deleteData("123");

        assertThrows(RuntimeException.class, () -> service.delete("123"));
        verify(mockApi).deleteData("123");
    }
}
