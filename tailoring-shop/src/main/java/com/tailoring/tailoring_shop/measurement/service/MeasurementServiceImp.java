package com.tailoring.tailoring_shop.measurement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tailoring.tailoring_shop.customer.entity.Customer;
import com.tailoring.tailoring_shop.customer.repository.CustomerRepository;
import com.tailoring.tailoring_shop.measurement.dto.MeasurementRequestDto;
import com.tailoring.tailoring_shop.measurement.dto.MeasurementResponseDto;
import com.tailoring.tailoring_shop.measurement.entity.Measurement;
import com.tailoring.tailoring_shop.measurement.repository.MeasurementRepository;

@Service
public class MeasurementServiceImp implements MeasurementService {
	
	@Autowired
	private MeasurementRepository measurmentRepo;
	
	@Autowired
	private CustomerRepository customerRepo;
	
	public MeasurementResponseDto createMeasurement(MeasurementRequestDto dto) {
		Customer customer = customerRepo.findById(dto.getCustomerId())
				.orElseThrow(() -> new RuntimeException("Customer not found"));
		Measurement measurement = new Measurement();
		measurement.setCustomer(customer);
		measurement.setDressType(dto.getDressType());
		
		Measurement save = measurmentRepo.save(measurement);
		 
		MeasurementResponseDto res = new MeasurementResponseDto();
		res.setMeasurementId(save.getMesurementId());
		res.setDressType(save.getDressType());	
		res.setCustomerId(customer.getCustomerId());
		
		return res;
	} 
}
