package com.financeCompany.agri.project.appDto;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

import lombok.Data;

@Data
public class DocumentsDto {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int documentdtoid;
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
