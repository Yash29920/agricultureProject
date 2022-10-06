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
public class RegistraionAddress
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
 	private int addressid;
	
 	private int houseNo;
	
 	private String areaName;
	
 	private String streetName;
	
 	private String cityname;
	
 	private String district;
	
 	private String state;
	
 	private int pincode;


}
