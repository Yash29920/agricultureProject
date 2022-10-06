package com.financeCompany.agri.project.appModel;

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
public class CustomerLedger {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ledgerid;
	private int regcustomerid;
	
	private String customerName;
	private LocalDate emiDueDate;
	private LocalDate emiPaidDate;
	private LocalDate nextEmiDate;
	private LocalDate loanCompletionDate;
	
	private double sanctionAmount;
	private double paidEmiAmount;
	private double monthlyEmi;
	
	
	private double remainingAmount;
	private String previousAmountStatus;
	private String CurrentMonthEmiStatus;
	
	private double interest;
	private String rateOfInterest;
	private double loanTenure;

	
	
}
