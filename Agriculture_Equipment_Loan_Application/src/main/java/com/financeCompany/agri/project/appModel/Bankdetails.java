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
	
	
    private long bankaccountno;

    private String bankName;
	
	private String branchName;
	
	private String ifscCode;
	
	private String branchAddress;
	
	private String micrCode;

	private long contactNo;

}
