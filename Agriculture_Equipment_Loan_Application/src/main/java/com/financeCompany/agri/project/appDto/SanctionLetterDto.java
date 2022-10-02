package com.financeCompany.agri.project.appDto;

import javax.persistence.Entity;
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
	private int applicationID;

	private String regFirstName;

	private String regMiddleName;

	private String regLastName;

	private String equipmentName;

	private double requiredLoanAmount;

	private String equipmentDetails;

	private int cibilscore;

	private double rateOfInterest;

	private int loanTenure;

	private double monthlyEmi;

	private double interest;

	private double totalAmount;

	private double sanctionAmount;

	private double processingFees;

	private String status;

	private String comment;

}
