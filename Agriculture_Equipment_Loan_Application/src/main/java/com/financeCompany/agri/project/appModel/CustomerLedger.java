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
	private LocalDate emiDueDate;
	private LocalDate emiPaidDate;
	private double paidEmiAmount;
	private double monthlyEmi;
	private LocalDate nextEmiDate;
	
	private double sanctionAmount;
	private double totalPaidAmount;
	
	private double remainingAmount;
	private String previousAmountStatus;
	private String CurrentMonthEmiStatus;
	
	
	
}
