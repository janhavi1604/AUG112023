package com.compare;

public class Customer {

	public Customer(String customerName, String planType, String location, float planAmount) {
		super();
		CustomerName = customerName;
		this.planType = planType;
		Location = location;
		this.planAmount = planAmount;
	}
	String CustomerName;
	String planType;
	String Location;
	float planAmount;
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	public String getPlanType() {
		return planType;
	}
	public void setPlanType(String planType) {
		this.planType = planType;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	public float getPlanAmount() {
		return planAmount;
	}
	public void setPlanAmount(float planAmount) {
		this.planAmount = planAmount;
	}
	@Override
	public String toString() {
		return "Customer [CustomerName=" + CustomerName + ", planType=" + planType + ", Location=" + Location
				+ ", planAmount=" + planAmount + "]";
	}
	
	
}
