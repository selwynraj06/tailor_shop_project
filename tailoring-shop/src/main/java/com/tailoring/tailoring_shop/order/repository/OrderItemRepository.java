package com.tailoring.tailoring_shop.order.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tailoring.tailoring_shop.measurement.entity.Measurement.DressType;
import com.tailoring.tailoring_shop.order.entity.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	List<OrderItem> findByPersonPersonIdAndDressType(Long personId,DressType dressType);
}
