package com.kodilla.kodillahibernate.task.dao;

import com.kodilla.kodillahibernate.task.Task;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
@Repository
@Transactional
public interface TaskDao extends CrudRepository<Task, Integer> {
    List<Task> findByDuration(int duration);
    @Query
    List<Task> retrieveLongTasks();
    @Query
    List<Task> retrieveShortTasks();

    @Query(nativeQuery = true)
    List<Task> retrieveTasksWithEnoughTime();
}
