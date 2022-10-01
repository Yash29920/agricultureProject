package com.financeCompany.agri.project.appModel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GeneratorType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class EmiCalculation {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int emiid;
	private double monthlyEmi;
	private double interest;
	private double totalAmount;
	
}
