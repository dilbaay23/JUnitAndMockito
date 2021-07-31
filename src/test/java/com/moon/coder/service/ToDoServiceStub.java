package com.moon.coder.service;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Moon on 31/07/2021
 */

//These is a dummy implementation for test
public class ToDoServiceStub implements  ToDoService{

    @Override
    public List<String> retrieveTodos(String user) {
        if(user.equals("coder")){
            return Arrays.asList("");

        }
        return Arrays.asList("Learn Spring MVC", "Learn Spring Cloud", "Learn Kubernetes", "Learn Terraform");

    }
}
