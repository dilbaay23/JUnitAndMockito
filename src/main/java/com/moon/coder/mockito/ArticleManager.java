package com.moon.coder.mockito;

/**
 * Created by Moon on 1/08/2021
 */
public class ArticleManager {
    private OtherUser user;
    private ArticleDatabase database;

    public ArticleManager(OtherUser user, ArticleDatabase database) {
        this.user = user;
        this.database = database;
    }

    public void initialize() {
        database.addListener(new ArticleListener());
    }
}
