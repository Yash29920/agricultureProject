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
public class EnquiryDetails 
{

	@NotNull
	private String username;
	@NotNull
	private String password;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int enquiryid;
	@NotNull
	private String firstName;
	@NotNull
	private String middelName;
	@NotNull
	private String lastName;
	@NotNull
	private Date dateOfBirth;
	@NotNull
	private int age;
	@NotNull
	private String gender;
	@NotNull
    private	String email;
	@NotNull
	private long mobileNo;
	@NotNull
	private long pancardNo;
	@NotNull
	private long aadharCardNo;
	@NotNull
    private String	equipmentName;
	@NotNull
	private double loanAmount;
	@NotNull
	private String equipmentDetails;
	@NotNull
    private String comment;



}
