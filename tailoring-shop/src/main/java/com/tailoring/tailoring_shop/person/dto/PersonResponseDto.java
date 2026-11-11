package com.tailoring.tailoring_shop.person.dto;

public class PersonResponseDto {

	private Long personId;
	private String name;
	private Long customerId;
	public PersonResponseDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PersonResponseDto(Long personId, String name, Long customerId) {
		super();
		this.personId = personId;
		this.name = name;
		this.customerId = customerId;
	}
	public Long getPersonId() {
		return personId;
	}
	public void setPersonId(Long personId) {
		this.personId = personId;
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
