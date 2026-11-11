package com.tailoring.tailoring_shop.person.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tailoring.tailoring_shop.person.dto.PersonRequestDto;
import com.tailoring.tailoring_shop.person.dto.PersonResponseDto;
import com.tailoring.tailoring_shop.person.service.PersonService;

@RestController
@RequestMapping("/person")
public class PersonController {

	@Autowired
	private PersonService personService;
	
	@PostMapping
	public PersonResponseDto createPerson(@RequestBody PersonRequestDto dto) {
		return personService.createPerson(dto);
	}
	
	@GetMapping("/customer/{customerId}")
	public List<PersonResponseDto> getPerson(@PathVariable Long customerId){
		return personService.getPersonByCustomer(customerId);
	}
}
