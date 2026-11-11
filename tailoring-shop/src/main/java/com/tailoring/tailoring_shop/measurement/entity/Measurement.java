package com.tailoring.tailoring_shop.measurement.entity;

import java.time.LocalDateTime;

import com.tailoring.tailoring_shop.customer.entity.Customer;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;

@Entity
public class Measurement {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long measurementId;
	
	@ManyToOne
	@JoinColumn(name = "customer_id")
	private Customer customer;
	
	@Enumerated(EnumType.STRING)
	private DressType dressType;
	
	private LocalDateTime createdDate;
	
	
	public Measurement() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Measurement(Long measurementId, Customer customer, DressType dressType, LocalDateTime createdDate) {
		super();
		this.measurementId = measurementId;
		this.customer = customer;
		this.dressType = dressType;
		this.createdDate = createdDate;
	}

	public Long getMesurementId() {
		return measurementId;
	}

	public void setMesurementId(Long measurementId) {
		this.measurementId = measurementId;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public DressType getDressType() {
		return dressType;
	}

	public void setDressType(DressType dressType) {
		this.dressType = dressType;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	@PrePersist
	protected void onCreate() {
		createdDate = LocalDateTime.now();
	}
	
	public enum DressType {
	    HALF_PANT,
	    FULL_PANT,
	    HALF_SHIRT,
	    FULL_SHIRT
	}
	
}
