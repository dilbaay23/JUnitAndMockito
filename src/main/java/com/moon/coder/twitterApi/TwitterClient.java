package com.moon.coder.twitterApi;

/**
 * Created by Moon on 3/08/2021
 */
public class TwitterClient {
    public void sendTweet(ITweet tweet) {
        String message = tweet.getMessage();

        // TODO send the message to Twitter
        System.out.println(message);
    }
}
