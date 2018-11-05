package com.my.jdbc;

import java.util.Date;

public class Dept {

	private int id;
	private String name;
	private String description;
	private Date created_time;
	
	public Dept() {}

	public Dept(int id, String name, String description, Date created_time) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.created_time = created_time;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getCreated_time() {
		return created_time;
	}

	public void setCreated_time(Date created_time) {
		this.created_time = created_time;
	}

	@Override
	public String toString() {
		return "Dept [id=" + id + ", name=" + name + ", description=" + description + ", created_time=" + created_time
				+ "]";
	}
	

}
