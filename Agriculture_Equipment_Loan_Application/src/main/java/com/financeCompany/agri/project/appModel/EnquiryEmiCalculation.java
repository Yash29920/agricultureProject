package com.financeCompany.agri.project.appModel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EnquiryEmiCalculation {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int enqemiid;
	
	private int enquiryid;
	private double monthlyEmi;
	private double interest;
	private double totalAmount;
	private String rateOfInterest;
	private double loanTenure;
	private double requiredLoanAmount;
}
