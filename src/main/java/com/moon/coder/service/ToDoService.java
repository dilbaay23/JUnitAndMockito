package com.moon.coder.service;

import java.util.List;

/**
 * Created by Moon on 31/07/2021
 */

// If these service Imlementation is not available for us while testing TodOBusinessImpl
// Step 1 : Create ToDoServiceStub for only testing
// Step 2:  Test ToDoBusinessImpl using these ToDoServiceStub

public interface ToDoService {
    public List<String> retrieveTodos(String user);
}
