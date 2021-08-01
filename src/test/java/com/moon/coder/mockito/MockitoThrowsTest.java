package com.moon.coder.mockito;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Properties;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

/**
 * Created by Moon on 1/08/2021
 */
public class MockitoThrowsTest {

    // demonstrates the configuration of a throws with Mockito
    // not a read test, just "testing" Mockito behavior
    @Test
    public void checkMockitoThrows(){
        Properties properties = Mockito.mock(Properties.class);
        when(properties.get(Mockito.anyString())).thenThrow(new IllegalArgumentException("Stuff"));
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> properties.get("Moon"));
        assertEquals("Stuff", exception.getMessage());
    }
}
