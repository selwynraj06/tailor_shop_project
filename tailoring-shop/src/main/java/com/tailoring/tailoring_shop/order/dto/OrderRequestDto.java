package com.tailoring.tailoring_shop.order.dto;

import java.time.LocalDateTime;
import java.util.List;


public class OrderRequestDto {
	
	private Long customerId;
	
    private LocalDateTime deliveryDate;

    private Double advance;

    private String paymentStatus;

    private String status;

    private List<OrderItemDto> items;

	public OrderRequestDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrderRequestDto(Long customerId, LocalDateTime deliveryDate, Double advance, String paymentStatus,
			String status, List<OrderItemDto> items) {
		super();
		this.customerId = customerId;
		this.deliveryDate = deliveryDate;
		this.advance = advance;
		this.paymentStatus = paymentStatus;
		this.status = status;
		this.items = items;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public LocalDateTime getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(LocalDateTime deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public Double getAdvance() {
		return advance;
	}

	public void setAdvance(Double advance) {
		this.advance = advance;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<OrderItemDto> getItems() {
		return items;
	}

	public void setItems(List<OrderItemDto> items) {
		this.items = items;
	}
    
    
}
