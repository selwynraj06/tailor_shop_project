package com.tailoring.tailoring_shop.order.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tailoring.tailoring_shop.measurement.dto.MeasurementResponseDto;
import com.tailoring.tailoring_shop.measurement.entity.Measurement.DressType;
import com.tailoring.tailoring_shop.order.dto.OrderRequestDto;
import com.tailoring.tailoring_shop.order.dto.OrderResponseDto;
import com.tailoring.tailoring_shop.order.service.OrderServiceImp;

@RestController
@RequestMapping("/orders")
public class OrderController {
	
	@Autowired
	private OrderServiceImp orderService;
	
	@PostMapping
	public OrderResponseDto createOrder(@RequestBody OrderRequestDto order) {
		return orderService.createOrder(order);
	}
	
	@GetMapping
	public List<OrderResponseDto> getAllOrders(){
		return orderService.getAllOrders();
	}
	
	@GetMapping("/{orderId}")
	public OrderResponseDto getOrderById(@PathVariable Long orderId) {
		return orderService.getOrderById(orderId);
	}
	
	@GetMapping("/measurements")
	public List<MeasurementResponseDto> getMeasurement(
			@RequestParam Long personId,
			@RequestParam DressType dressType){
		
		return orderService.getMeasurementsByPersonAndDress(personId, dressType);
	}
}
