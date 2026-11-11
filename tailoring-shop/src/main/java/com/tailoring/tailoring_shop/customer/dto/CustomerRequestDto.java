package com.tailoring.tailoring_shop.customer.dto;

public class CustomerRequestDto {
	
	private String name;
	private String mobile;
	private String address;
	public CustomerRequestDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CustomerRequestDto(String name, String mobile, String address) {
		super();
		this.name = name;
		this.mobile = mobile;
		this.address = address;
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
	
}
