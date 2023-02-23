package com.kodilla.kodillahibernate.tasklist.dao;

import com.kodilla.kodillahibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;
    private static final String DESCRIPTION = "Test: Learn Hibernate";

    @Test
    void testFindByListName(){
        //Given
        TaskList taskList = new TaskList(DESCRIPTION,"NAME");
        taskListDao.save(taskList);
        try{
            String name = taskList.getListName();

            List<TaskList> taskListList = taskListDao.findByListName(name);

            assertEquals(1,taskListList.size());
            //Clean up
        }finally{
            taskListDao.deleteAll();
        }

    }
}
