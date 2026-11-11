package com.tailoring.tailoring_shop.customer.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tailoring.tailoring_shop.customer.entity.Customer;


public interface CustomerRepository extends JpaRepository<Customer, Long> {
	Optional<Customer> findByMobile(String mobile);
}
