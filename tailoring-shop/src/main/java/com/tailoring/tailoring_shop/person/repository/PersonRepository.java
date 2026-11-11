package com.tailoring.tailoring_shop.person.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tailoring.tailoring_shop.person.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {
	List<Person> findByCustomerCustomerId(Long CustomerId);
}
