package com.tailoring.tailoring_shop.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tailoring.tailoring_shop.customer.dto.CustomerRequestDto;
import com.tailoring.tailoring_shop.customer.dto.CustomerResponseDto;
import com.tailoring.tailoring_shop.customer.service.CustomerService;



@RestController
@RequestMapping("/customers")
public class CustomerController {
	
	@Autowired
	private CustomerService customerServ;
	
	@PostMapping
    //	http://localhost:8080/customers
	public CustomerResponseDto addCustomer(@RequestBody CustomerRequestDto dto) {
		return customerServ.createCustomer(dto);
		
	}
	
	@GetMapping 
	//	http://localhost:8080/customers
	public List<CustomerResponseDto> getAllCustomers(){
		return customerServ.getAllCustomer();
	}
	
	@GetMapping("/{id}")
	//	http://localhost:8080/customers/1
	public CustomerResponseDto getCustomerById(@PathVariable Long id) {
		return customerServ.getCustomerById(id);
	}
	
	@GetMapping("/mobile/{mobile}")
	//	http://localhost:8080/customers/mobile/9876543210
	public CustomerResponseDto getCustomerByMobile(@PathVariable String mobile) {
		return customerServ.getCustomerByMobile(mobile);
	}
	
	@PutMapping("/{id}")
	// http://localhost:8080/customers/1
	public CustomerResponseDto updateCustomer(@PathVariable Long id,@RequestBody CustomerRequestDto dto) {
		return customerServ.updateCustomer(id, dto);
	}
	
	@DeleteMapping("/{id}")
	//	http://localhost:8080/customers/1
	public void deleteCustomer(@PathVariable Long id) {
		customerServ.deleteCustomer(id);
	}
}
