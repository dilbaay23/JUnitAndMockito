package com.moon.coder.mockito;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

/**
 * Created by Moon on 1/08/2021
 */
@ExtendWith(MockitoExtension.class)
public class ArticleManagerTest {
    @Mock ArticleDatabase database;
    @Mock
    OtherUser user;

    @InjectMocks
    private ArticleManager manager;   //creates an instance of ArticleManager and injects the mocks into it

    @Test
    public void shouldTestArticleManagerInitializeMethod() {

      // calls addListener with an instance of ArticleListener
        manager.initialize();

        // validate that addListener was called
        Mockito.verify(database).addListener(Mockito.any(ArticleListener.class));
    }
    /*
    Mockito can inject mocks either via constructor injection, setter injection, or property injection
    and in this order. So if ArticleManager would have a constructor that would only take User and setters for both fields,
     only the mock for User would be injected
     */

}
