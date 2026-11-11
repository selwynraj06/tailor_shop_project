package com.tailoring.tailoring_shop.order.entity;

import java.time.LocalDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.tailoring.tailoring_shop.customer.entity.Customer;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long orderId;
	
	@ManyToOne
	@JoinColumn(name = "customer_id")
	private Customer customer;
		
	private LocalDateTime orderDate;
	
	private LocalDateTime deliveryDate;
	
	private Double totalAmount;
	
	private Double advance;
	
	private String paymentStatus;
	
	private String status;
	
	private LocalDateTime createdDate;
	
	@OneToMany(mappedBy = "order",cascade = CascadeType.ALL)
	@JsonManagedReference
	private List<OrderItem> items;
	
	@PrePersist
	protected void onCreate() {
		orderDate = LocalDateTime.now();
		createdDate = LocalDateTime.now();
	}

	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Order(Long orderId, Customer customer, LocalDateTime orderDate, LocalDateTime deliveryDate,
			Double totalAmount, Double advance, String paymentStatus, String status, LocalDateTime createdDate,
			List<OrderItem> items) {
		super();
		this.orderId = orderId;
		this.customer = customer;
		this.orderDate = orderDate;
		this.deliveryDate = deliveryDate;
		this.totalAmount = totalAmount;
		this.advance = advance;
		this.paymentStatus = paymentStatus;
		this.status = status;
		this.createdDate = createdDate;
		this.items = items;
	}
	
	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
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

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public List<OrderItem> getItems() {
		return items;
	}

	public void setItems(List<OrderItem> items) {
		this.items = items;
	}
	
}
