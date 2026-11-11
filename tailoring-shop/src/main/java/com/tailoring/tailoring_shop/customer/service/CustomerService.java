package com.tailoring.tailoring_shop.customer.service;


import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tailoring.tailoring_shop.customer.dto.CustomerRequestDto;
import com.tailoring.tailoring_shop.customer.dto.CustomerResponseDto;
import com.tailoring.tailoring_shop.customer.entity.Customer;
import com.tailoring.tailoring_shop.customer.repository.CustomerRepository;


@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepo;
			//Create the Customer Details
	public CustomerResponseDto createCustomer(CustomerRequestDto dto){

        Customer customer = new Customer();

        customer.setName(dto.getName());
        customer.setMobile(dto.getMobile());
        customer.setAddress(dto.getAddress());

        Customer saved = customerRepo.save(customer);

        return convertToDTO(saved);
    }
			//get all customer details in list
	public List<CustomerResponseDto> getAllCustomer(){
		return customerRepo.findAll()
				.stream()
				.map(this::convertToDTO)
				.collect(Collectors.toList()); 
	}
			// Get the customer Details by ID
	public CustomerResponseDto getCustomerById(Long id){
		Customer customer = customerRepo.findById(id).orElseThrow(
				() -> new RuntimeException("Id not found")
				);
		return convertToDTO(customer);
	}
			// Get the customer Details by MOBILE NUMBER
	public CustomerResponseDto getCustomerByMobile(String mobile) {
		Customer customer = customerRepo.findByMobile(mobile).orElseThrow(
				() -> new RuntimeException("Mobile number not found")
				);
		return convertToDTO(customer);
	}
			// Update or Make changes in Customer Details
	public CustomerResponseDto updateCustomer(Long id,CustomerRequestDto dto) {
		Customer customer = customerRepo.findById(id).orElseThrow(
				() -> new RuntimeException("Customer Not Found")
				);
		if(dto.getName()!=null) {
			customer.setName(dto.getName());
		}
		
		if(dto.getMobile()!=null) {
			customer.setMobile(dto.getMobile());
		}
		
		if(dto.getAddress()!= null) {
			customer.setAddress(dto.getAddress());
		}
		Customer updateCustomer = customerRepo.save(customer);
		return convertToDTO(updateCustomer);
	}
			//Delete the Customer Details 
	public void deleteCustomer(Long id) {
		getCustomerById(id);
		customerRepo.deleteById(id);
	}
	
	private CustomerResponseDto convertToDTO(Customer customer) {
		CustomerResponseDto dto = new CustomerResponseDto();
		
		dto.setCustomerId(customer.getCustomerId());
		dto.setName(customer.getName());
		dto.setMobile(customer.getMobile());
		dto.setAddress(customer.getAddress());
		dto.setCreatedDate(customer.getCreatedDate());
		
		return dto;
	}
}
