package com.udayan.gson;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Date;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.udayan.gson.binding.Address;
import com.udayan.gson.binding.Customer;
import com.udayan.gson.binding.InsurancePolicy;

public class GsonConversionDemo {
	public static void main(String[] args) throws JsonSyntaxException, JsonIOException, FileNotFoundException {
		InsurancePolicy policy = new InsurancePolicy("Jeevan-Anand", new Date(), new Date(), 500000.00);
		Address address = new Address("vellore", "India", "632058");
		Customer customer = new Customer(101, "udayakumar", 33, "mailofudayan@gmail.com", policy, address);
		//Gson gson = new Gson();
		Gson gson=new GsonBuilder().setDateFormat("dd-MM-YYYY").create();
		String jsonString = gson.toJson(customer);
		System.out.println(jsonString);

		Customer customerObject = gson.fromJson(new FileReader(new File("customer.json")), Customer.class);
		System.out.println(customerObject);
	}
}
