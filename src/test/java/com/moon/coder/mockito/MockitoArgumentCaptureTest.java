package com.moon.coder.mockito;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;
import static org.mockito.Mockito.verify;

/**
 * Created by Moon on 1/08/2021
 */

@ExtendWith(MockitoExtension.class)
public class MockitoArgumentCaptureTest {
    @Captor
    private ArgumentCaptor<List<String>> captor;

    @Test
    public final void shouldContainCertainListItem(@Mock List<String> mockedList) {
        var myList = Arrays.asList("moon", "sun");
        mockedList.addAll(myList);

        verify(mockedList).addAll(captor.capture());
        List<String> capturedArgument = captor.getValue();
        assertThat(capturedArgument,hasItem("moon"));
    }
}
