package com.tailoring.tailoring_shop.order.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.tailoring.tailoring_shop.measurement.entity.Measurement;
import com.tailoring.tailoring_shop.measurement.entity.Measurement.DressType;
import com.tailoring.tailoring_shop.person.entity.Person;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "order_items")
public class OrderItem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long itemId;
	
	@ManyToOne
	@JoinColumn(name = "order_id")
	@JsonBackReference
	private Order order;
	
	@Enumerated(EnumType.STRING)
	private DressType dressType;
	
	@ManyToOne
	@JoinColumn(name = "person_id")
	private Person person;
	
	@ManyToOne
	@JoinColumn(name = "measurement_id")
	private Measurement measurement;
	
	private Integer quantity;
	
	private Double price;
	
	private String status;

	public OrderItem() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrderItem(Long itemId, Order order, DressType dressType, Person person, 
			Measurement measurement,Integer quantity, Double price,String status) {
		super();
		this.itemId = itemId;
		this.order = order;
		this.dressType = dressType;
		this.person = person;
		this.measurement = measurement;
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

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public DressType getDressType() {
		return dressType;
	}

	public void setDressType(DressType dressType) {
		this.dressType = dressType;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Measurement getMeasurement() {
		return measurement;
	}

	public void setMeasurement(Measurement measurement) {
		this.measurement = measurement;
	}

	public Double getPrice() {
		return price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
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
