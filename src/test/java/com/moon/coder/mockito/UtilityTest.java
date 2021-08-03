package com.moon.coder.mockito;

import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by Moon on 3/08/2021
 */
public class UtilityTest {
    @Test
    void shouldMockStaticMethod() {
        MockedStatic<FinalClass> mockStatic = Mockito.mockStatic(FinalClass.class);
        try (MockedStatic<Utility> mockedStatic = Mockito.mockStatic(Utility.class)) {

            mockedStatic.when(() -> Utility.getDatabaseConnection(Mockito.eq("test"))).thenReturn("testing");
            mockedStatic.when(() -> Utility.getDatabaseConnection(Mockito.eq("prod"))).thenReturn("production");

            String result1 = Utility.getDatabaseConnection("test");

            assertEquals("testing", result1);
            String result2 = Utility.getDatabaseConnection("prod");
            assertEquals("production", result2);

        }

    }
}
