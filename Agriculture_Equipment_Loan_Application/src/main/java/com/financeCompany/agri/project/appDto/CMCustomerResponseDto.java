package com.financeCompany.agri.project.appDto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.financeCompany.agri.project.appModel.EmiCalculation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CMCustomerResponseDto {

	
	private int regcustomerid;
	
	private String regFirstName;
	private String regMiddleName;
	private String regLastName;
	private String email;
	private String panNo;
	private long mobile;
	private String gender;
	private int cibilscore;
	private String status;
	
	private int emiid1;
	private double monthlyEmi1;
	private double interest1;
	private double totalAmount1;
	private String rateOfInterest1;
	private double loanTenure1;
	private double requiredLoanAmount1;
	
	private int emiid2;
	private double monthlyEmi2;
	private double interest2;
	private double totalAmount2;
	private String rateOfInterest2;
	private double loanTenure2;
	private double requiredLoanAmount2;
	
	private int emiid3;
	private double monthlyEmi3;
	private double interest3;
	private double totalAmount3;
	private String rateOfInterest3;
	private double loanTenure3;
	private double requiredLoanAmount3;
	
}
