package com.moon.coder.service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Moon on 31/07/2021
 */

//ToDoBusinessImpl is SUT = SystemUnderTest
//ToDoService is Dependency

public class ToDoBusinessImpl {
    private ToDoService toDoService;

    public ToDoBusinessImpl(ToDoService toDoService) {
        this.toDoService = toDoService;
    }

    public List<String> retrieveToDosRelatedToSpring(String user){
        List<String> filteredTodos= new ArrayList<String>();
        List<String> todos= toDoService.retrieveTodos(user);
        for (String todo: todos){
            if(todo.contains("Spring")){
                filteredTodos.add(todo);
            }
        }
        return  filteredTodos;
    }

}
