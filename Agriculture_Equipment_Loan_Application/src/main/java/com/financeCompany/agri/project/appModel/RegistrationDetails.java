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
public class RegistrationDetails 
{
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
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
	@NotNull
	private RegistraionAddress regAddress;
	private Documents documents;
	private Bankdetails bankDetails;
	private PreviousLoan previousLoan;
	private GuarantorDetails guarantorDetails;
	private PreviousEmiDetails previousEmiDetails;


}
