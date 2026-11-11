package com.tailoring.tailoring_shop.order.dto;

import java.time.LocalDateTime;
import java.util.List;

public class OrderResponseDto {

	 private Long orderId;

	 private String customerName;

	 private LocalDateTime orderDate;

	 private LocalDateTime deliveryDate;

	 private Double totalAmount;

	 private Double advance;

	 private String paymentStatus;

	 private String status;

	 private List<OrderItemDto> items;

	 public OrderResponseDto() {
		super();
		// TODO Auto-generated constructor stub
	 }

	 public OrderResponseDto(Long orderId, String customerName,LocalDateTime orderDate, LocalDateTime deliveryDate,
			Double totalAmount, Double advance, String paymentStatus, String status, List<OrderItemDto> items) {
		super();
		this.orderId = orderId;
		this.customerName = customerName;
		this.orderDate = orderDate;
		this.deliveryDate = deliveryDate;
		this.totalAmount = totalAmount;
		this.advance = advance;
		this.paymentStatus = paymentStatus;
		this.status = status;
		this.items = items;
	 }

	 public Long getOrderId() {
		 return orderId;
	 }

	 public void setOrderId(Long orderId) {
		 this.orderId = orderId;
	 }

	 public String getCustomerName() {
		 return customerName;
	 }

	 public void setCustomerName(String customerName) {
		 this.customerName = customerName;
	 }

	 public LocalDateTime getOrderDate() {
		 return orderDate;
	 }

	 public void setOrderDate(LocalDateTime orderDate) {
		 this.orderDate = orderDate;
	 }

	 public LocalDateTime getDeliveryDate() {
		 return deliveryDate;
	 }

	 public void setDeliveryDate(LocalDateTime deliveryDate) {
		 this.deliveryDate = deliveryDate;
	 }

	 public Double getTotalAmount() {
		 return totalAmount;
	 }

	 public void setTotalAmount(Double totalAmount) {
		 this.totalAmount = totalAmount;
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
