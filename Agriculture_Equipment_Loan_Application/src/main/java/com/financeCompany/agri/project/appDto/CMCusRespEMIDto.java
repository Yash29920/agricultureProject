package com.financeCompany.agri.project.appDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CMCusRespEMIDto {
	private int regcustomerid;
	private double monthlyEmi;
	private double interest;
	private double totalAmount;
	private String rateOfInterest;
	private double loanTenure;
	private double requiredLoanAmount;
	
	
}
