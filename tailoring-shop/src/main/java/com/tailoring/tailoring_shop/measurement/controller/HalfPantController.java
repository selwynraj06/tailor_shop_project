//package com.tailoring.tailoring_shop.measurement.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.tailoring.tailoring_shop.measurement.service.HalfPantService;
//
//@RestController
//@RequestMapping("/halfpant")
//public class HalfPantController {
//	
//	@Autowired
//	private HalfPantService hpService;
//	
//	@GetMapping("/{measurmentId}")
//	public Object getDetails(@PathVariable Long measurementId) {
//		return hpService.getDetails(measurementId);
//	}
//	
//}
