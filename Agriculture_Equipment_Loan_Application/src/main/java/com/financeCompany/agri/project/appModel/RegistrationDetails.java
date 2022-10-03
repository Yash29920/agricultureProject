package com.financeCompany.agri.project.appModel;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegistrationDetails 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private int regcustomerid;
	
	
    private String username;
	
	private String password;
	
	
    private String regFirstName;
	
	private String regMiddleName;
	
	private String regLastName;
	
	private Date dateOfBirth;
	
	private String gender;
	
	private long mobile;
	
	private String email;
	
	private String panNo;
	
	
    private String	equipmentName;
	
	private double requiredLoanAmount;
	
	private String equipmentDetails;
	
	
	
	
	@OneToOne(cascade = CascadeType.ALL)
	private RegistraionAddress regAddress;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Documents documents;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Bankdetails bankDetails;
	
	@OneToOne(cascade = CascadeType.ALL)
	private PreviousLoan previousLoan;
	
	@OneToOne(cascade = CascadeType.ALL)
	private GuarantorDetails guarantorDetails;
	
	@OneToOne(cascade = CascadeType.ALL)
	private CustomerVerify customerVerify;
	
	@OneToOne(cascade = CascadeType.ALL)
	private CibilScoreCheck cibilScoreCheck;

	@OneToMany(cascade = CascadeType.ALL)
	private List<EmiCalculation> emiCalculation;
	
}
