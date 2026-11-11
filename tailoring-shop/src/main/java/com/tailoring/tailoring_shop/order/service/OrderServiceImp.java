package com.tailoring.tailoring_shop.order.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tailoring.tailoring_shop.customer.entity.Customer;
import com.tailoring.tailoring_shop.customer.repository.CustomerRepository;
import com.tailoring.tailoring_shop.exception.ResourceNotFoundException;
import com.tailoring.tailoring_shop.measurement.dto.MeasurementResponseDto;
import com.tailoring.tailoring_shop.measurement.entity.Measurement;
import com.tailoring.tailoring_shop.measurement.entity.Measurement.DressType;
import com.tailoring.tailoring_shop.measurement.repository.MeasurementRepository;
import com.tailoring.tailoring_shop.order.dto.OrderItemDto;
import com.tailoring.tailoring_shop.order.dto.OrderRequestDto;
import com.tailoring.tailoring_shop.order.dto.OrderResponseDto;
import com.tailoring.tailoring_shop.order.entity.Order;
import com.tailoring.tailoring_shop.order.entity.OrderItem;
import com.tailoring.tailoring_shop.order.repository.OrderItemRepository;
import com.tailoring.tailoring_shop.order.repository.OrderRepository;
import com.tailoring.tailoring_shop.person.entity.Person;
import com.tailoring.tailoring_shop.person.repository.PersonRepository;

@Service
public class OrderServiceImp implements OrderService {
	
	@Autowired
	private OrderRepository orderRepo;
	
	@Autowired
	private CustomerRepository customerRepo;
	
	@Autowired
	private MeasurementRepository measurementRepo;
	
	@Autowired
	private PersonRepository personRepo;
	
	@Autowired
	private OrderItemRepository orderItemRepo;
	
//	@Autowired
//	private MeasurementDetailsFactory measurementDetailsFactory;
	
	@Override
	public OrderResponseDto createOrder(OrderRequestDto requestDto) {
		Customer customer = customerRepo
				.findById(requestDto.getCustomerId())
				.orElseThrow( () -> new RuntimeException("Customer Not Found"));
		
		Order order = new Order();
		order.setCustomer(customer);
		order.setDeliveryDate(requestDto.getDeliveryDate());
		order.setAdvance(requestDto.getAdvance());
		order.setPaymentStatus(requestDto.getPaymentStatus());
		order.setStatus(requestDto.getStatus());
		
		List<OrderItem> orderItems = new ArrayList<OrderItem>();
		
		Double totalAmount = 0.0;
		for(OrderItemDto itemDto:requestDto.getItems()) {
			
			OrderItem item = new OrderItem();
			
			item.setOrder(order);

			Person person = personRepo.findById(itemDto.getPersonId()).orElseThrow(
					() -> new RuntimeException("Person not found")
					);
			item.setPerson(person);
			item.setDressType(itemDto.getDressType());
			
			Measurement measurement;
			
			if(itemDto.getMeasurementId() != null) {
				measurement = measurementRepo.findById(itemDto.getMeasurementId())
						.orElseThrow(()-> new RuntimeException("Measurement Not Found"));
				if(measurement.getDressType() != itemDto.getDressType()) {
					throw new RuntimeException("Measurment Dose not match Dress type");
				}
			}
			else {
				measurement = new Measurement();
				measurement.setCustomer(customer);
				measurement.setDressType(itemDto.getDressType());
				measurement = measurementRepo.save(measurement);
			}
			item.setMeasurement(measurement);
			item.setQuantity(itemDto.getQuantity());
			item.setPrice(itemDto.getPrice());
			item.setStatus(itemDto.getStatus());
			
			totalAmount += itemDto.getPrice()*itemDto.getQuantity();
			
			orderItems.add(item);
		}
		
		order.setItems(orderItems);
		order.setTotalAmount(totalAmount);
		
		Order savedOrder = orderRepo.save(order);
		
		return mapToResponseDto(savedOrder);
	}
	
	@Override
    public List<OrderResponseDto> getAllOrders(){
    	List<Order> orders = orderRepo.findAll();
    	List<OrderResponseDto> responseList = new ArrayList<OrderResponseDto>();
    	
    	for(Order order: orders) {
    		responseList.add(mapToResponseDto(order));
    	}
    	return responseList;
    	
    }
	
	@Override
	public List<MeasurementResponseDto> getMeasurementsByPersonAndDress(Long personId, DressType dressType){
		List<OrderItem> items = orderItemRepo
				.findByPersonPersonIdAndDressType(personId, dressType);
		
		List<MeasurementResponseDto> result = new ArrayList<MeasurementResponseDto>();
		
		for(OrderItem item:items) {
			Measurement measurement = item.getMeasurement();
			
			MeasurementResponseDto dto = new MeasurementResponseDto();
			dto.setMeasurementId(measurement.getMesurementId());
			dto.setDressType(measurement.getDressType());
			
			result.add(dto);
		}
		return result;
		
	}
	
	public OrderResponseDto getOrderById(Long orderId) {
		Order order = orderRepo.findById(orderId).orElseThrow(
				() -> new ResourceNotFoundException("Order not found with id: "+orderId)
					);
		return mapToResponseDto(order);
	}
	
	private OrderResponseDto mapToResponseDto(Order order) {

        OrderResponseDto dto = new OrderResponseDto();
        
        dto.setOrderId(order.getOrderId());
        dto.setCustomerName(order.getCustomer().getName());
     
        dto.setOrderDate(order.getOrderDate());
        dto.setDeliveryDate(order.getDeliveryDate());
        
        dto.setTotalAmount(order.getTotalAmount());
        dto.setAdvance(order.getAdvance());
        
        dto.setPaymentStatus(order.getPaymentStatus());
        dto.setStatus(order.getStatus());

        List<OrderItemDto> itemDtos = new ArrayList<>();

        for (OrderItem item : order.getItems()) {

            OrderItemDto itemDto = new OrderItemDto();

            itemDto.setItemId(item.getItemId());
            itemDto.setDressType(item.getDressType());
            itemDto.setPersonName(item.getPerson().getName());
            itemDto.setPersonId(item.getPerson().getPersonId());
            itemDto.setMeasurementId(item.getMeasurement().getMesurementId());
            itemDto.setQuantity(item.getQuantity());
            itemDto.setPrice(item.getPrice());
            itemDto.setStatus(item.getStatus());

            itemDtos.add(itemDto);
        }

        dto.setItems(itemDtos);

        return dto;
    }
}
