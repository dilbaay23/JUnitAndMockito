package com.moon.coder.mockito;

import javax.security.auth.callback.Callback;

/**
 * Created by Moon on 1/08/2021
 */
public class Service {
    private Database database;

    public Service(Database database) {
        this.database = database;
    }

    public boolean query(String query) {
        return database.isAvailable();
    }
    public <T> Object login(Callback callback) {
       return null;
    }


    @Override
    public String toString() {
        return "Using database with id: " + String.valueOf(database.getUniqueId());
    }
}
