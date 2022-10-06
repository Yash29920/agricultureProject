package com.financeCompany.agri.project.appModel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PreviousLoan 
{

	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 private int ploanid;
	
	 private double ploanAmount;
	
	 private double pTenure;
	
	 private double paidAmount;
	 
	 private double remainingAmount;
	
	 private String branchName;
	
	 private String ifscCode;
	 
	 private String micr;
	 
	 private long contactNo;
	
	 private String branchAddress;
	
	 private String email;
	 	 


}
