package com.TodoList.demo.Repository;

import com.TodoList.demo.Model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

    public Task findByTask(String task);
    List<Task> findByCompletedTrue();
    List<Task> findByCompletedFalse();
    List<Task> findAll();
    public Task getById(Long id);

}

