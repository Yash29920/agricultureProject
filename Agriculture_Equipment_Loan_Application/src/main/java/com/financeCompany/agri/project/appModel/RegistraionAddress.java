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
	@NotNull
 	private int houseNo;
	@NotNull
 	private String areaName;
	@NotNull
 	private String streetName;
	@NotNull
 	private String cityname;
	@NotNull
 	private String district;
	@NotNull
 	private String state;
	@NotNull
 	private int pincode;


}
