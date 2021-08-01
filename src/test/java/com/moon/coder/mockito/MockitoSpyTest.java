package com.moon.coder.mockito;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

/**
 * Created by Moon on 1/08/2021
 */
public class MockitoSpyTest {

    //@Spy or the spy() method can be used to wrap a real object.
    // Every call, unless specified otherwise, is delegated to the object.

    @Test
    public void testMockitoThrows() {

        Properties properties = new Properties();
        Properties spyProperties = spy(properties);

        doReturn("38").when(spyProperties).get("shoeSize");

        String value = (String) spyProperties.get("shoeSize");

        assertEquals("38", value);
    }

    //The doThrow variant can be used for methods which return void to throw an exception.
    @Test
    public void testForIOException() throws IOException {
        // create an configure mock
        OutputStream mockStream = mock(OutputStream.class);
        doThrow(new IOException()).when(mockStream).close();

        // use mock
        OutputStreamWriter streamWriter = new OutputStreamWriter(mockStream);

        assertThrows(IOException.class, () -> streamWriter.close());
    }

    @Test
    public void testLinkedListSpyCorrect() {
        // Lets mock a LinkedList
        List<String> list = new LinkedList<>();
        List<String> spyList = spy(list);

        // this would not work as delegate it called so spy.get(0)
        // throws IndexOutOfBoundsException (list is still empty)
       //when u write -->  when(spyList.get(0)).thenReturn("foo");

        // so you have to use doReturn() for stubbing
        doReturn("hero").when(spyList).get(0);

        assertEquals("hero", spyList.get(0));
    }
}
