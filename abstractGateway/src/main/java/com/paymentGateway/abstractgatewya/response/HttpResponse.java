package com.paymentGateway.abstractgatewya.response;

public class HttpResponse {
	private String statusCode;
	private String description;
	private String refId;
	private long amount;
	
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}
	public String getDescription() {
		return description;
	}
	public void setDescriptiong(String description) {
		this.description = description;
	}
	public String getRefId() {
		return refId;
	}
	public void setRefId(String refId) {
		this.refId = refId;
	}
	public Long getAmount() {
		return amount;
	}
	public void setAmount(Long long1) {
		this.amount = long1;
	}
	

}
