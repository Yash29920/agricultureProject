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
	@NotNull
    private String regFirstName;
	@NotNull
	private String regMiddleName;
	@NotNull
	private String regLastName;
	@NotNull
	private Date dateOfBirth;
	@NotNull
	private String gender;
	@NotNull
	private long mobile;
	@NotNull
	private String email;
	
	@OneToOne(cascade = CascadeType.ALL)
	private List<RegistraionAddress> regAddress;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Documents documents;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Bankdetails bankDetails;
	
	@OneToOne(cascade = CascadeType.ALL)
	private PreviousLoan previousLoan;
	
	@OneToOne(cascade = CascadeType.ALL)
	private List<GuarantorDetails> guarantorDetails;
	
	@OneToOne(cascade = CascadeType.ALL)
	private CustomerVerify customerVerify;
	
	@OneToOne(cascade = CascadeType.ALL)
	private CibilScoreCheck cibilScoreCheck;
	
	
}
