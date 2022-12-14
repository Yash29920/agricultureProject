package com.financeCompany.agri.project.appModel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Documents 
{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int documentid;
	
	private String panNo;
	@Lob
	private byte[] pancard;
	@Lob
	private byte[] incomeTaxReturn;
	@Lob
	private byte[] aadharCard;
	@Lob
	private byte[] photo;
	@Lob
	private byte[] cancelCheque;
	@Lob
	private byte[] signature;
	@Lob
	private byte[] thumb;
	@Lob
	private byte[] landDocumentA;
	@Lob
	private byte[] landDocumentB;
	@Lob
	private byte[] addressProof;
	@Lob
	private byte[] equipmentQuotation;
	@Lob
	private byte[] gSignature;
	@Lob
	private byte[] gPhoto;
	@Lob
	private byte[] gBankStatement;
	
}


