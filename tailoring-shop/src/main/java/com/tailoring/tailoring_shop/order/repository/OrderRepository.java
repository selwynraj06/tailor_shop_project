package com.tailoring.tailoring_shop.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tailoring.tailoring_shop.order.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
