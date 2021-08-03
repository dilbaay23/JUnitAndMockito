package com.moon.coder.twitterApi;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.mockito.Mockito.*;

/**
 * Created by Moon on 3/08/2021
 */
public class TwitterClientTest {
    @Mock
    ITweet tweet;

    @Test
    public void testSendingTweet(){
        TwitterClient twitterClient = new TwitterClient();

        ITweet iTweet = mock(ITweet.class);
        when(iTweet.getMessage()).thenReturn("Using mockito is great");

        twitterClient.sendTweet(iTweet);

        verify(iTweet, atLeastOnce()).getMessage();
    }
}
