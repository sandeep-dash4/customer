package com.customers.model;

public class Customer {
	
	String id;
	
	String name;
	
	String orderId;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", orderId=" + orderId + "]";
	}
	
	

}
