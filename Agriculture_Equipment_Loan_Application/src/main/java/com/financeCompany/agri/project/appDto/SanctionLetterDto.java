package com.financeCompany.agri.project.appDto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SanctionLetterDto {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int applicationID;

	private int regcustomerid;
	
	private String regFirstName;

	private String regMiddleName;

	private String regLastName;

	private String equipmentName;

	private double requiredLoanAmount;

	private String equipmentDetails;

	private int cibilscore;

	private String rateOfInterest;

	private double loanTenure;

	private double monthlyEmi;

	private double interest;

	private double totalAmount;

	private double sanctionAmount;

	private double processingFees;

	private String status;

	private String comment;

}
