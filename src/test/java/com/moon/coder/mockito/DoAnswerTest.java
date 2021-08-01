package com.moon.coder.mockito;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;


import javax.security.auth.callback.Callback;
import java.util.List;

import static org.mockito.AdditionalAnswers.returnsFirstArg;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

/**
 * Created by Moon on 1/08/2021
 */

/*
thenReturn returns a predefined value every time. With an Answer object you can calculate a response based on the
arguments given to your stubbed method.

This can be useful if your stubbed method is supposed to call a function on one of the arguments or if your method
is supposed to return the first argument to allow method chaining. There exists a static method for the latter.
Also note that there a different ways to configure an answer:
 */
@ExtendWith(MockitoExtension.class)
public class DoAnswerTest {
    //TODO: those 2 tests needs to be fixed

    @Mock
    List<String> myList;

    @Test
    public final void answerTest() {

        // with doAnswer():
        doAnswer(returnsFirstArg()).when(myList).add(anyString());
        // with thenAnswer():
        when(myList.add(anyString())).thenAnswer(returnsFirstArg());
        // with then() alias:
        when(myList.add(anyString())).then(returnsFirstArg());
    }
    @Test
    public final void callbackTest() {
        Service service = mock(Service.class);
        when(service.login(any(Callback.class))).thenAnswer(i -> {
            Callback callback = i.getArgument(0);
            callback.notify("Success");
            return null;
        });
    }
}
