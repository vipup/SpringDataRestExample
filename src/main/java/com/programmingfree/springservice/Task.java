package com.programmingfree.springservice;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;

import com.couchbase.client.java.repository.annotation.Field;

@Document
public class Task {

    @Id 
	private int id = (int) (System.currentTimeMillis()%Integer.MAX_VALUE);
	
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTaskArchived() {
		return taskArchived;
	}

	@Field
    @NotNull
	private String taskName;
	
    @Field
    @NotNull
	private String taskDescription;
	
    @Field
    @NotNull
	private String taskPriority;
	
    @Field
    @NotNull
	private String taskStatus;
	
    @Field
    @NotNull
	private int taskArchived = 0;

	public int getTaskId() {
		return id;
	}

	public void setTaskId(int taskId) {
		this.id = taskId;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getTaskDescription() {
		return taskDescription;
	}

	public void setTaskDescription(String taskDescription) {
		this.taskDescription = taskDescription;
	}

	public String getTaskPriority() {
		return taskPriority;
	}

	public void setTaskPriority(String taskPriority) {
		this.taskPriority = taskPriority;
	}

	public String getTaskStatus() {
		return taskStatus;
	}

	public void setTaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
	}

	public int isTaskArchived() {
		return taskArchived;
	}

	public void setTaskArchived(int taskArchived) {
		this.taskArchived = taskArchived;
	}

	@Override
	public String toString() {
		return "Task [id=" + id + ", taskName=" + taskName
				+ ", taskDescription=" + taskDescription + ", taskPriority="
				+ taskPriority + ",taskStatus=" + taskStatus + "]";
	}

}

