package com.tailoring.tailoring_shop.customer.dto;

import java.time.LocalDateTime;

public class CustomerResponseDto {

	private Long customerId;
    private String name;
    private String mobile;
    private String address;
    private LocalDateTime createdDate;
	public CustomerResponseDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CustomerResponseDto(Long customerId, String name, String mobile, String address, LocalDateTime createdDate) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.mobile = mobile;
		this.address = address;
		this.createdDate = createdDate;
	}
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public LocalDateTime getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}
    
    
}
