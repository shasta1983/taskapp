package com.prado.spring.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.prado.spring.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
	  List<Task> findByDone(boolean done);
	  List<Task> findByTitleContaining(String title);
}
