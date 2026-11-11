package com.tailoring.tailoring_shop.measurement.dto;

import com.tailoring.tailoring_shop.measurement.entity.Measurement.DressType;

public class MeasurementResponseDto {
	
	private Long measurementId;   
	private DressType dressType;
	private Long customerId;
	private Object details;
	
	public MeasurementResponseDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MeasurementResponseDto(Long measurementId, DressType dressType,Long customerId,Object details) {
		super();
		this.measurementId = measurementId;
		this.dressType = dressType;
		this.customerId = customerId;
		this.details = details;
	}

	public Long getMeasurementId() {
		return measurementId;
	}

	public void setMeasurementId(Long measurementId) {
		this.measurementId = measurementId;
	}

	public DressType getDressType() {
		return dressType;
	}

	public void setDressType(DressType dressType) {
		this.dressType = dressType;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public Object getDetails() {
		return details;
	}

	public void setDetails(Object details) {
		this.details = details;
	}
	
}
