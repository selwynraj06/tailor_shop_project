package com.tailoring.tailoring_shop.measurement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tailoring.tailoring_shop.measurement.dto.MeasurementRequestDto;
import com.tailoring.tailoring_shop.measurement.dto.MeasurementResponseDto;
import com.tailoring.tailoring_shop.measurement.service.MeasurementService;

@RestController
@RequestMapping("/measurement")
public class MeasurmentController {

	@Autowired
	private MeasurementService measurementService;
	
	@PostMapping
	public MeasurementResponseDto createMeasurement(@RequestBody MeasurementRequestDto dto) {
		return measurementService.createMeasurement(dto);
	}
}
