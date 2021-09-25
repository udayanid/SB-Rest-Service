package com.udayan.json.binding;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
	@JsonProperty("cid")
	private Integer customerId;
	private String customerName;
	private int customerAge;
	private String customerEmailId;
	// customer is using InsurancePolicy as a reference, which is nothing but
	// composition (has a relationship)
	private InsurancePolicy policy;
	private Address address;
}
