package com.tailoring.tailoring_shop.person.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tailoring.tailoring_shop.customer.entity.Customer;
import com.tailoring.tailoring_shop.customer.repository.CustomerRepository;
import com.tailoring.tailoring_shop.person.dto.PersonRequestDto;
import com.tailoring.tailoring_shop.person.dto.PersonResponseDto;
import com.tailoring.tailoring_shop.person.entity.Person;
import com.tailoring.tailoring_shop.person.repository.PersonRepository;

@Service
public class PersonServiceImp implements PersonService {
	
	@Autowired
	private PersonRepository personRepo;
	
	@Autowired
	private CustomerRepository customerRepo;
	
	@Override
	public PersonResponseDto createPerson(PersonRequestDto dto) {
		Customer customer = customerRepo.findById(dto.getCustomerId())
				.orElseThrow(()-> new RuntimeException("Customer Not Found"));
		
		Person person = new Person();
		person.setName(dto.getName());
		person.setCustomer(customer);
		
		Person save = personRepo.save(person);
		
		return mapToResponse(save);
	}
	
	@Override
	public List<PersonResponseDto> getPersonByCustomer(Long customerId){
		List<Person> persons = personRepo.findByCustomerCustomerId(customerId);
		List<PersonResponseDto> result= new ArrayList<PersonResponseDto>();
		
		for(Person p: persons) {
			result.add(mapToResponse(p));
		}
		
		return result;
	}
	
	private PersonResponseDto mapToResponse(Person persons) {
		
		PersonResponseDto dto = new PersonResponseDto();
		dto.setPersonId(persons.getPersonId());
		dto.setName(persons.getName());
		dto.setCustomerId(persons.getCustomer().getCustomerId());
		
		return dto;
	}
}
