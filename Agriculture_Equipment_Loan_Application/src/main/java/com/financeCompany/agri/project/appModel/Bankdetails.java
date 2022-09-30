package com.financeCompany.agri.project.appModel;

import javax.persistence.Entity;
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
	private long bankAccountNo;
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
	private long conatctNo;

}
