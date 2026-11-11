package com.tailoring.tailoring_shop.person.dto;

public class PersonRequestDto {
	
	private String name;
	private Long customerId;
	public PersonRequestDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PersonRequestDto(String name, Long customerId) {
		super();
		this.name = name;
		this.customerId = customerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	
	
}
