package com.financeCompany.agri.project.appModel;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.financeCompany.agri.project.appDto.EnquirySubsidyOfferDto;
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
	private String firstName;
	@NotNull
	private String middleName;
	@NotNull
	private String lastName;
	
	private Date dateOfBirth;

	private int age;
	
	private String gender;
	
    private	String email;
	
	private long mobileNo;
	
	private String pancardNo;
	
	private long aadharCardNo;
	
    private String	equipmentName;
	
	private double loanAmount;
	
	private String equipmentDetails;
	
    private String comment;

	@OneToMany(cascade = CascadeType.ALL)
	private List<EnquiryEmiCalculation> enquiryEmiCalculation;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<EnquirySubsidyOfferDto> enquirySubsidyOfferDto;
	
}
