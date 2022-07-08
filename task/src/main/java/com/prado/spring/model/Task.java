package com.prado.spring.model;

import javax.persistence.*;
@Entity
@Table(name = "tasks")
public class Task {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(name = "title")
	private String title;
	@Column(name = "description")
	private String description;
	@Column(name = "done")
	private boolean done;
	public Task() {
	}
	public Task(String title, String description, boolean done) {
		this.title = title;
		this.description = description;
		this.done = done;
	}
	public long getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isDone() {
		return done;
	}
	public void setDone(boolean isDone) {
		this.done = isDone;
	}
	@Override
	public String toString() {
		return "Task [id=" + id + ", title=" + title + ", desc=" + description + ", done=" + done + "]";
	}
}
