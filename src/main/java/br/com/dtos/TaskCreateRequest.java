package br.com.dtos;

import java.io.Serializable;
import java.time.LocalDate;

import br.com.enums.TaskPriority;
import br.com.enums.TaskStatus;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class TaskCreateRequest implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@NotBlank
	private String title;
	@Size(max = 500, message = "Description cannot exceed 500 characters")
	private String description;
	private TaskStatus status;
	private TaskPriority priority;
	@Future(message = "The date must be in the future")
	private LocalDate dueDate;
	
	public TaskCreateRequest() {
	}

	public TaskCreateRequest(@NotBlank String title,
			@Size(max = 500, message = "Description cannot exceed 500 characters") String description,
			TaskStatus status, TaskPriority priority,
			@Future(message = "The date must be in the future") LocalDate dueDate) {
		this.title = title;
		this.description = description;
		this.status = status;
		this.priority = priority;
		this.dueDate = dueDate;
	}
	
	
	public String getTitle() {
		return title;
	}

	public void setTitle(@NotBlank String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(@Size(max = 500, message = "A descrição deve conter no máximo 500 caracteres")String description) {
		this.description = description;
	}

	public TaskStatus getStatus() {
		return status;
	}

	public void setStatus(TaskStatus status) {
		this.status = status;
	}

	public TaskPriority getPriority() {
		return priority;
	}

	public void setPriority(TaskPriority priority) {
		this.priority = priority;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

}
