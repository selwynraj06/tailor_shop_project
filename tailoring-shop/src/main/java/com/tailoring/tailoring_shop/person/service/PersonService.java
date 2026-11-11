package com.tailoring.tailoring_shop.person.service;

import java.util.List;

import com.tailoring.tailoring_shop.person.dto.PersonRequestDto;
import com.tailoring.tailoring_shop.person.dto.PersonResponseDto;

public interface PersonService {
	
	PersonResponseDto createPerson(PersonRequestDto dto);
	
	List<PersonResponseDto> getPersonByCustomer(Long customerId);
}
