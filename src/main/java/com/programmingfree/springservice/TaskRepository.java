package com.programmingfree.springservice;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource; 

@RepositoryRestResource
public interface TaskRepository extends CrudRepository<Task, Integer> {
	  
	public List<Task> findByTaskArchived(@Param("archivedfalse") int taskArchivedFalse); 
	public List<Task> findByTaskStatus(@Param("status") String taskStatus);

}