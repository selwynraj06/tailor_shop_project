package com.tailoring.tailoring_shop.measurement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tailoring.tailoring_shop.measurement.entity.Measurement.DressType;

@Service
public class MeasurementDetailsFactory {
	
	@Autowired
    private HalfPantService halfPantService;

    public MeasurementDetailsService getService(DressType type) {

        switch (type) {
            case HALF_PANT:
                return halfPantService;

            // later add others
            // case FULL_PANT:
            // case HALF_SHIRT:

            default:
                throw new RuntimeException("Unsupported dress type");
        }
    }
}
