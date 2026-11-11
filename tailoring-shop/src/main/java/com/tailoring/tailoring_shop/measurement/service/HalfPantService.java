package com.tailoring.tailoring_shop.measurement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tailoring.tailoring_shop.measurement.dto.HalfPantDto;
import com.tailoring.tailoring_shop.measurement.entity.HalfPantMeasurement;
import com.tailoring.tailoring_shop.measurement.repository.HalfPantRepository;

@Service
public class HalfPantService implements MeasurementDetailsService {

	@Autowired
	private HalfPantRepository halfPantRepo;
	
	@Override
	public Object getDetails(Long measurementId) {
		

    	HalfPantMeasurement hp = halfPantRepo
    			.findByMeasurementMeasurementId(measurementId)
    			.orElse(null);
    	if(hp==null) return null;
    	
    	HalfPantDto	dto = new HalfPantDto();
    		
    	dto.setHeight(hp.getHeight());
    	dto.setFork(hp.getFork());
   		dto.setWaist(hp.getWaist());
   		dto.setSeat(hp.getSeat());

   		dto.setStyle(hp.getStyle());
   		dto.setSize1(hp.getSize1());
    	dto.setSize2(hp.getSize2());
   		dto.setSideStitch(hp.getSideStitch());
   		dto.setPocketSize(hp.getPocketSize());

   		dto.setBackPocketCount(hp.getBackPocketCount());
   		dto.setLoops(hp.getLoops());
   		dto.setRemarks(hp.getRemarks());
    		
   		return dto;
	}
	
}
