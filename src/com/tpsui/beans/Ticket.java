package com.tpsui.beans;

public class Ticket {

	private Long id;
	private String description;
	private String createdDate;
	private String actionTaken;
	private String status;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}
	public String getActionTaken() {
		return actionTaken;
	}
	public void setActionTaken(String actionTaken) {
		this.actionTaken = actionTaken;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Ticket [id=" + id + ", description=" + description + ", createdDate=" + createdDate + ", actionTaken="
				+ actionTaken + ", status=" + status + "]";
	}
	
	
}
