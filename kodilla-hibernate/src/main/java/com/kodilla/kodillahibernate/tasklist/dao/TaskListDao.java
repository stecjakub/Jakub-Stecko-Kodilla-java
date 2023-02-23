package com.kodilla.kodillahibernate.tasklist.dao;

import com.kodilla.kodillahibernate.tasklist.TaskList;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TaskListDao extends CrudRepository<TaskList,String> {
    List<TaskList> findByListName(String listName);
}
