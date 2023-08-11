package com.consumer;

public class Recharge {

	
	public Recharge(String customerId, String amount, String validDate) {
		super();
		this.customerId = customerId;
		this.amount = amount;
		this.validDate = validDate;
	}
	String customerId;
	String amount;
	String validDate;
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getValidDate() {
		return validDate;
	}
	public void setValidDate(String validDate) {
		this.validDate = validDate;
	}
	@Override
	public String toString() {
		return "Recharge [customerId=" + customerId + ", amount=" + amount + ", validDate=" + validDate + "]";
	}
	
	
}
