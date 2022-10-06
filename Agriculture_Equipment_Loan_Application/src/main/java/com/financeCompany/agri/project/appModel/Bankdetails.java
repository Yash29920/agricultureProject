package com.financeCompany.agri.project.appModel;

import javax.persistence.CascadeType;
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
@NoArgsConstructor
@AllArgsConstructor
public class Bankdetails
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bankid;
	
	@NotNull
    private long bankaccountno;
	@NotNull
    private String bankName;
	@NotNull
	private String branchName;
	@NotNull
	private String ifscCode;
	@NotNull
	private String branchAddress;
	@NotNull
	private String micrCode;
	@NotNull
	private long contactNo;

}
