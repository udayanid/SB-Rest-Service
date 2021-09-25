package com.udayan.gson.binding;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
	private Integer customerId;
	private String customerName;
	private int customerAge;
	private String customerEmailId;
	// customer is using insurancepolicy as a reference, which is nothing but
	// composition (has a relationship)
	private InsurancePolicy policy;
	private Address address;
}
