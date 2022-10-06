package com.financeCompany.agri.project.appDto;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerLoanDisbursement {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int customerdisbursementid;
	
	private int regcustomerid;
	
	private LocalDate customerDisbursementDate;
	
	private String regFirstName;

	private String regMiddleName;

	private String regLastName;

	private String equipmentName;

	private String equipmentDetails;

	private String rateOfInterest;

	private double loanTenure;

	private double monthlyEmi;

	private double interest;

	private double totalAmount;

	private double sanctionAmount;

	private double processingFees;

	
	private LocalDate customerLoanCompletionDate;
	
	private double loanDisbursedAmount;
	
	
	
	
	
}
