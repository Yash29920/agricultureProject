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
	
	private String gName;
	
	private Date gDateofBirth;
	
	private String gRelationshipwithCustomer;
	
	private long gMobileNo;
	
	private long gAadharCardNo;
	
	private String gPancard;
	
	private String gJobDetails;
	
	private String gAddress;
	
	private byte[] gSignature;
	
	private byte[] gPhoto;
	
	private byte[] gBankStatement;
	
	

}
