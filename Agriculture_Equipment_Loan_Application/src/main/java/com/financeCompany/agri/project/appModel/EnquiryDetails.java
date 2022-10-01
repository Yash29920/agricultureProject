package com.financeCompany.agri.project.appModel;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

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

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int enquiryid;
	@NotNull
	private String username;
	@NotNull
	private String password;
	@NotNull
	private String firstName;
	@NotNull
	private String middleName;
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
	private String pancardNo;
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

	@OneToMany(cascade = CascadeType.ALL)
	private List<EmiCalculation> emiCalculation;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<SubsidyOffer> subsidyOffer;
	
}
