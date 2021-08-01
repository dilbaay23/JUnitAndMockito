package com.moon.coder.mockito;

/**
 * Created by Moon on 1/08/2021
 */
public class Database {
    private  int uniqueId;

    public boolean isAvailable() {
        // TODO implement the access to the database
        return false;
    }

    public int getUniqueId() {
        return 23;
    }
    public void setUniqueId(int uniqueId) {
       this.uniqueId=uniqueId;
    }
}
