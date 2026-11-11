package com.tailoring.tailoring_shop.order.dto;

import com.tailoring.tailoring_shop.measurement.entity.Measurement.DressType;

public class OrderItemDto {
	
	 private Long itemId;
	 
	 private DressType dressType;
	 
	 private Long personId;
	 
	 private String personName;
	 
	 private Long measurementId;
	 
	 private Integer quantity;

	 private Double price;
	 
	 private String status;

	 public OrderItemDto() {
		super();
		// TODO Auto-generated constructor stub
	 }

	 public OrderItemDto(Long itemId, DressType dressType,Long personId, String personName, Long measurementId,
			 Integer quantity ,Double price,
			String status) {
		super();
		this.itemId = itemId;
		this.dressType = dressType;
		this.personId = personId;
		this.personName = personName;
		this.measurementId = measurementId;
		this.quantity = quantity;
		this.price = price;
		this.status = status;
	 }

	 public Long getItemId() {
		 return itemId;
	 }

	 public void setItemId(Long itemId) {
		 this.itemId = itemId;
	 }

	 public DressType getDressType() {
		 return dressType;
	 }

	 public void setDressType(DressType dressType) {
		 this.dressType = dressType;
	 }

	 public Long getPersonId() {
		return personId;
	}

	 public void setPersonId(Long personId) {
		 this.personId = personId;
	 }

	 public String getPersonName() {
		 return personName;
	 }

	 public void setPersonName(String personName) {
		 this.personName = personName;
	 }

	 public Long getMeasurementId() {
		 return measurementId;
	 }

	 public void setMeasurementId(Long measurementId) {
		 this.measurementId = measurementId;
	 }
	 
	 public Integer getQuantity() {
			return quantity;
		}

		 public void setQuantity(Integer quantity) {
			 this.quantity = quantity;
		 }

	 public Double getPrice() {
		 return price;
	 }

	 public void setPrice(Double price) {
		 this.price = price;
	 }

	 public String getStatus() {
		 return status;
	 }

	 public void setStatus(String status) {
		 this.status = status;
	 }
	 
	 
}
