package com.udayan.gson.binding;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InsurancePolicy {
	private String policyName;
	private Date startDate;
	private Date endDate;
	private Double premiumAmount;

}
