package com.financeCompany.agri.project.appModel;

import java.sql.Date;

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
public class PreviousEmiDetails
{
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int emiId;
	@NotNull
	private double emiMonthlyAmount;
	@NotNull
	private Date nextEmiDueDate;
	@NotNull
	private double pendingLoanAmount;
	@NotNull
	private double totalLoanAmount;

	

}
