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
	 @GeneratedValue(strategy = GenerationType.SEQUENCE)
	 private int ploanId;
	 @NotNull
	 private double ploanAmount;
	 @NotNull
	 private double pTenure;
	 @NotNull
	 private double paidAmount;
	 @NotNull
	 private double remainingAmount;
	 @NotNull
	 private int deafulterCount;
	 @NotNull
	 private String pbankDetails;
	 @NotNull
	 private String status;
	 @NotNull
	 private String	remark;
	 


}
