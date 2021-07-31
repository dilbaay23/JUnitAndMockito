package com.moon.coder;

import com.moon.coder.service.ToDoBusinessImplStubTest;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CoderApplicationTests {

    @Test
    void contextLoads() {
         ToDoBusinessImplStubTest toDoBusinessImplStubTest=
                new ToDoBusinessImplStubTest();
         toDoBusinessImplStubTest.testRetrieveTodosRelatedToSpring_usingAStub();
    }

}
