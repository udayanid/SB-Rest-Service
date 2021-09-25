package com.udayan.json;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.udayan.json.binding.Address;
import com.udayan.json.binding.Customer;
import com.udayan.json.binding.InsurancePolicy;

public class JacksonConversionDemo {

	public static void main(String[] args) throws IOException {
		InsurancePolicy policy = new InsurancePolicy("jeevanAnand", new Date(), new Date(), 500000.00);
		Address address = new Address("vellore", "India", "632058");
		Customer customer = new Customer(101, "udayakumar", 33, "mailofudayan@gmail.com", policy, address);
		System.out.println(customer);

		ObjectMapper mapper = new ObjectMapper();
		// java object to json conversion is called as json serialization
		// creating jsonstring
		String jsonString = mapper.writeValueAsString(customer);
		System.out.println(jsonString);
		// creating json file
		mapper.writeValue(new File("customer.json"), customer);

		// converting json string to java object is called as json-deserialization
		Customer c1 = mapper.readValue(jsonString, Customer.class);
		System.out.println(c1);
		Customer customerObject = mapper.readValue(new File("customer.json"), Customer.class);
		System.out.println(customerObject);

	}

}
