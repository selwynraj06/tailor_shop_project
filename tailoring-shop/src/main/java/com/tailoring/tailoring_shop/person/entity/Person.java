package com.tailoring.tailoring_shop.person.entity;

import com.tailoring.tailoring_shop.customer.entity.Customer;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Person {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long personId;
	
	private String name;
	
	@ManyToOne
	@JoinColumn(name = "customer_id")
	private Customer customer;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(Long personId, String name, Customer customer) {
		super();
		this.personId = personId;
		this.name = name;
		this.customer = customer;
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

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
}
