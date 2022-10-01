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
public class GuarantorDetails
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private int gid;
	@NotNull
	private String gName;
	@NotNull
	private Date gDateofBirth;
	@NotNull
	private String gRelationshipwithCustomer;
	@NotNull
	private long gMobileNo;
	@NotNull
	private long gAadharCardNo;
	@NotNull
	private String gPancard;
	@NotNull
	private String gJobDetails;
	@NotNull
	private String gAddress;
	@NotNull
	private byte[] gSignature;
	@NotNull
	private byte[] gPhoto;
	@NotNull
	private byte[] gBankStatement;
	
	

}
