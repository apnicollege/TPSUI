package com.tpsui.beans;

public class Executive {
	private Long id;
	private String name;
	private String department;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Executive [id=" + id + ", name=" + name + ", department=" + department + "]";
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
 
	
	
	
}
