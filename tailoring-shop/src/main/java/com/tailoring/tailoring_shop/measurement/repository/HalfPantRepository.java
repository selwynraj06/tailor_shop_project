package com.tailoring.tailoring_shop.measurement.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tailoring.tailoring_shop.measurement.entity.HalfPantMeasurement;

public interface HalfPantRepository extends JpaRepository<HalfPantMeasurement, Long>{
	
	Optional<HalfPantMeasurement> findByMeasurementMeasurementId(Long measurementId);
}
