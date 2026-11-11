package com.tailoring.tailoring_shop.order.service;

import java.util.List;

import com.tailoring.tailoring_shop.measurement.dto.MeasurementResponseDto;
import com.tailoring.tailoring_shop.measurement.entity.Measurement.DressType;
import com.tailoring.tailoring_shop.order.dto.OrderRequestDto;
import com.tailoring.tailoring_shop.order.dto.OrderResponseDto;

public interface OrderService {
	
	OrderResponseDto createOrder(OrderRequestDto requestDto);
	
	List<OrderResponseDto> getAllOrders();
	
	OrderResponseDto getOrderById(Long orderId);
	
	List<MeasurementResponseDto> getMeasurementsByPersonAndDress(Long personId, DressType dressType);
	
}
