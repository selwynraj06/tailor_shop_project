package com.tailoring.tailoring_shop.measurement.service;

import com.tailoring.tailoring_shop.measurement.dto.MeasurementRequestDto;
import com.tailoring.tailoring_shop.measurement.dto.MeasurementResponseDto;

public interface MeasurementService {
	
	MeasurementResponseDto createMeasurement(MeasurementRequestDto dto);
}
