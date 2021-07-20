package com.udayan.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.udayan.request.PassengerRequest;
import com.udayan.request.TicketInfoResponse;

@RestController
@RequestMapping(value = "/irctc")
public class BookingRestController {

	@GetMapping
	public String homePage() {
		return "Welcome to IRCTC Services";
	}

	@PostMapping(value = "/booking", 
			consumes = { "application/xml", "application/json" }, 
			produces = {"application/xml", "application/json" })
	public TicketInfoResponse booking(@RequestBody PassengerRequest request) {
		System.out.println("request:" + request);
		TicketInfoResponse response = new TicketInfoResponse();
		response.setPrice(1500.75f);
		response.setStatus("Confirmed");
		BeanUtils.copyProperties(request, response);
		System.out.println("response:" + response);
		return response;
	}
}
