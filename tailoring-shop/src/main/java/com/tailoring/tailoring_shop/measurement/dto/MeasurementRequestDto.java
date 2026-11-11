package com.tailoring.tailoring_shop.measurement.dto;

import com.tailoring.tailoring_shop.measurement.entity.Measurement.DressType;

public class MeasurementRequestDto {
	
	private Long customerId;
	private DressType dressType;
	public MeasurementRequestDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MeasurementRequestDto(Long customerId, DressType dressType) {
		super();
		this.customerId = customerId;
		this.dressType = dressType;
	}
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	public DressType getDressType() {
		return dressType;
	}
	public void setDressType(DressType dressType) {
		this.dressType = dressType;
	}
	
	
}
