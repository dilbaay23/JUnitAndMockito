package com.moon.coder.mockito;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

/**
 * Created by Moon on 1/08/2021
 */
@ExtendWith(MockitoExtension.class)  //	Tells Mockito to create the mocks based on the @Mock annotation, this requires JUnit 5, if you use JUnit 4, call Mock.init() in your setup method
public class ServiceTest {
    @Mock                            // If you use the @Mock annotation, you must trigger the initialization of the annotated fields. The MockitoExtension does this by calling the static method MockitoAnnotations.initMocks(this).
    Database databaseMock;           // Tells Mockito to mock the databaseMock instance

    @Mock
    Iterator<String> iterator;


    @Test
    public void testQuery(){
        assertNotNull(databaseMock);
        when(databaseMock.isAvailable()).thenReturn(true);  // Configure the Mock to return true when its isAvailable method is called,
        Service service  = new Service(databaseMock);             // Executes some code of the class under test
        boolean check = service.query("* from t");
        assertTrue(check);

    }

    @Test
    public void ensureMockitoReturnsTheConfiguredValue() {

        // define return value for method getUniqueId()
        when(databaseMock.getUniqueId()).thenReturn(23);

        Service service = new Service(databaseMock);
        // use mock in test....
        assertEquals(service.toString(), "Using database with id: 23");
    }


    @Test
    public void testMoreThanOneReturnValue() {

        when(iterator.next()).thenReturn("Mockito").thenReturn("rocks");
        String result= iterator.next() +" " +iterator.next();
        //assert
        assertEquals("Mockito rocks", result);
    }

    // this test demonstrates how to return values based on the input
    // and that @Mock can also be used for a method parameter
    @Test
    public void testReturnValueDependentOnMethodParameter(@Mock Comparable<String> c)  {
        when(c.compareTo("Mockito")).thenReturn(1);
        when(c.compareTo("Eclipse")).thenReturn(2);
        //assert
        assertEquals(1, c.compareTo("Mockito"));
        assertEquals(2, c.compareTo("Eclipse"));
    }

    // return a value based on the type of the provide parameter

    @Test
    public void testReturnValueInDependentOnMethodParameter2(@Mock Comparable<Integer> c )  {
        when(c.compareTo(isA(Integer.class))).thenReturn(0);
        //assert
        assertEquals(0, c.compareTo(Integer.valueOf(4)));
    }




}
