package com.tpsui.beans;

public class Ticket {

	private Long id;
	private String description;
	private String createdDate;
	private String actionTaken;
	private String status;
	
	private Executive executive;
	private Customer customer;
	
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
	public Executive getExecutive() {
		return executive;
	}
	public void setExecutive(Executive executive) {
		this.executive = executive;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	@Override
	public String toString() {
		return "Ticket [id=" + id + ", description=" + description + ", createdDate=" + createdDate + ", actionTaken="
				+ actionTaken + ", status=" + status + ", executive=" + executive + ", customer=" + customer + "]";
	}
	 
	
	
}
