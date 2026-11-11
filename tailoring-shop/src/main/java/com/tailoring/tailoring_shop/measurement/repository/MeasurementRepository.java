package com.tailoring.tailoring_shop.measurement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tailoring.tailoring_shop.measurement.entity.Measurement;

public interface MeasurementRepository extends JpaRepository<Measurement, Long> {

}
