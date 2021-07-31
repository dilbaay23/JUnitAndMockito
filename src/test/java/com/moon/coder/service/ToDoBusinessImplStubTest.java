package com.moon.coder.service;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Moon on 31/07/2021
 */

public class ToDoBusinessImplStubTest {

    @Test
    public void testRetrieveTodosRelatedToSpring_usingAStub(){
        ToDoService toDoServiceStub = new ToDoServiceStub();
        ToDoBusinessImpl toDoBusiness =
                new ToDoBusinessImpl(toDoServiceStub);
        List<String> springLearnList= toDoBusiness.retrieveToDosRelatedToSpring("Moon");

        assertEquals(2, springLearnList.size());
    }

    @Test
    public void testRetrieveTodosRelatedToSpring_usingAStub_userCoder(){
        ToDoService toDoServiceStub = new ToDoServiceStub();
        ToDoBusinessImpl toDoBusiness =
                new ToDoBusinessImpl(toDoServiceStub);
        List<String> springLearnList= toDoBusiness.retrieveToDosRelatedToSpring("coder");

        assertEquals(0, springLearnList.size());
    }

}